package lowLevelDesignProblems.foodDeliveryApp;

import lowLevelDesignProblems.foodDeliveryApp.models.Restaurant;
import lowLevelDesignProblems.foodDeliveryApp.service.Cart;
import lowLevelDesignProblems.foodDeliveryApp.service.Order;
import lowLevelDesignProblems.foodDeliveryApp.service.User;
import lowLevelDesignProblems.foodDeliveryApp.strategy.impl.SmsNotification;
import lowLevelDesignProblems.foodDeliveryApp.strategy.impl.UpiPayment;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        FoodDeliveryApplication foodDeliveryApplication = new FoodDeliveryApplication();

        //user created
        User user = new User("Rahul","Noida", new Cart(new ArrayList<>(),null,0));

        //searching for restaurant
        List<Restaurant> restaurantList = foodDeliveryApplication.searchRestaurant("Noida");

        //select restaurant from the list , we hardcoded to 0 th index
        foodDeliveryApplication.selectRestaurant(user,restaurantList.get(0));

        //displaying all items of the selected restaurant
        foodDeliveryApplication.displayMenuItemsOfRestaurant(user.getCart().getRestaurant());

        //items added to cart
        foodDeliveryApplication.addToCart(user,"P1");
        foodDeliveryApplication.addToCart(user,"P2");

        //display added items in cart
        foodDeliveryApplication.displaySelectedMenuItemsByUser(user);

        //order created
        Order order = foodDeliveryApplication.checkoutDeliveryOrder(user, new UpiPayment("abc&ybl"));

        //payment done
        foodDeliveryApplication.payForOrder(user,order,new SmsNotification("1122334455",order));


    }
}
