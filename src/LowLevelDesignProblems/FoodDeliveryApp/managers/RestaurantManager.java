package LowLevelDesignProblems.FoodDeliveryApp.managers;

import LowLevelDesignProblems.FoodDeliveryApp.models.Restaurant;

import java.util.ArrayList;
import java.util.List;
/** this should be a singleton class because we do not want different users to have different
objects of restaurant managers as if one user performs some CRUD op then we want that operation
 to be visible to other users as well **/
public class RestaurantManager {
    private List<Restaurant> restaurantList;
    private static RestaurantManager object;
    private RestaurantManager(){
        this.restaurantList = new ArrayList<>();
    }
    public static RestaurantManager getInstance(){
        if(object == null){
            synchronized (RestaurantManager.class){
                if(object == null){
                    object = new RestaurantManager();
                    return object;
                }
            }
        }
        return object;
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

    public void addRestaurant(Restaurant restaurant){
        restaurantList.add(restaurant);
    }
    public List<Restaurant> searchBasedOnLocation(String address){
        List<Restaurant> resultList = new ArrayList<>();
        for(Restaurant restaurant: restaurantList){
            if(restaurant.getAddress().equalsIgnoreCase(address)){
                resultList.add(restaurant);
            }
        }
        return resultList;
    }
}
