package LowLevelDesignProblems.FoodDeliveryApp;

import LowLevelDesignProblems.FoodDeliveryApp.enums.OrderType;
import LowLevelDesignProblems.FoodDeliveryApp.factory.OrderFactory;
import LowLevelDesignProblems.FoodDeliveryApp.managers.RestaurantManager;
import LowLevelDesignProblems.FoodDeliveryApp.models.MenuItems;
import LowLevelDesignProblems.FoodDeliveryApp.models.Restaurant;
import LowLevelDesignProblems.FoodDeliveryApp.service.Cart;
import LowLevelDesignProblems.FoodDeliveryApp.service.Order;
import LowLevelDesignProblems.FoodDeliveryApp.service.User;
import LowLevelDesignProblems.FoodDeliveryApp.strategy.NotificationStrategy;
import LowLevelDesignProblems.FoodDeliveryApp.strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliveryApplication {
    public FoodDeliveryApplication(){
        initializeApplication();
    }

    private void initializeApplication() {

        //creating menu items and adding it to menuItems list
        MenuItems menuItem1 = new MenuItems("P1","Chole Bhature",125);
        MenuItems menuItem2 = new MenuItems("P2","Dosa",300);
        MenuItems menuItem3 = new MenuItems("P3","Idli",189);
        List<MenuItems> menuItemsList = new ArrayList<>();
        menuItemsList.add(menuItem1);
        menuItemsList.add(menuItem2);
        menuItemsList.add(menuItem3);

        //creating restaurant
        Restaurant restaurant1 = new Restaurant("Haldirams","Noida",menuItemsList);
        Restaurant restaurant2 = new Restaurant("Bikanerwala","Noida",menuItemsList);

        List<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(restaurant1);
        restaurantList.add(restaurant2);

        //getting singleton instance of restaurant manager
        RestaurantManager restaurantManager = RestaurantManager.getInstance();
        restaurantManager.setRestaurantList(restaurantList);
    }

    public List<Restaurant> searchRestaurant(String address){
            return RestaurantManager.getInstance()
                .searchBasedOnLocation(address);
    }

    public void selectRestaurant(User user, Restaurant restaurant){
        user.getCart().setRestaurant(restaurant);
    }

    public void displayMenuItemsOfRestaurant(Restaurant restaurant){
        for(MenuItems menuItems : restaurant.getMenuItemsList()){
            System.out.println(menuItems.getCode() + " " + menuItems.getName() + " " + menuItems.getPrice());
        }
    }

    public void addToCart(User user,String itemCode){
        Restaurant restaurant = user.getCart().getRestaurant();
        if(restaurant == null){
            System.out.println("Select restaurant first");
        }else{
            List<MenuItems> menuItemsList = restaurant.getMenuItemsList();
            for(MenuItems menuItems : menuItemsList){
                if(menuItems.getCode().equalsIgnoreCase(itemCode)){
                    user.getCart().addMenuItemToCart(menuItems);
                }
            }
        }
    }

    public void knowTotalBill(User user){
        System.out.println("Your total bill for cart items " + user.getCart() + " is " + user.getCart().getTotalCost());
    }

    public Order checkoutDeliveryOrder(User user,PaymentStrategy paymentStrategy){
        return checkout(user,paymentStrategy,OrderType.DELIVERY_ORDER);
    }
    public Order checkoutPickoutOrder(User user,PaymentStrategy paymentStrategy){
        return checkout(user,paymentStrategy,OrderType.PICKUP_ORDER);
    }

    private Order checkout(User user,PaymentStrategy paymentStrategy,OrderType orderType) {
       return OrderFactory.createOrder(orderType, user, paymentStrategy);
    }

    public void payForOrder(User user, Order order, NotificationStrategy notificationStrategy){

        boolean isPaid = order.makePayment(user.getCart().getTotalCost());
        if(isPaid){
            notificationStrategy.notify("Order placed successfully");
            clearCart(user);
        }
    }

    private void clearCart(User user) {
        Cart cart = user.getCart();
        cart.getMenuItemsList().clear();
        cart.setTotalCost(0);
        cart.setRestaurant(null);
    }

    public void displaySelectedMenuItemsByUser(User user) {
        System.out.println("Below are the items added by the user in the cart");
        for(MenuItems menuItems : user.getCart().getMenuItemsList()){
            System.out.println(menuItems.getCode() + " " + menuItems.getName() + " " + menuItems.getPrice());
        }
    }
}
