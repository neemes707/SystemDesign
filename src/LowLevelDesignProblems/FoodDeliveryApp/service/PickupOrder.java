package LowLevelDesignProblems.FoodDeliveryApp.service;

import LowLevelDesignProblems.FoodDeliveryApp.enums.OrderType;
import LowLevelDesignProblems.FoodDeliveryApp.models.MenuItems;
import LowLevelDesignProblems.FoodDeliveryApp.models.Restaurant;
import LowLevelDesignProblems.FoodDeliveryApp.strategy.PaymentStrategy;

import java.util.List;

public class PickupOrder extends Order{
    public PickupOrder(Restaurant restaurant, User user, PaymentStrategy paymentStrategy, List<MenuItems> menuItemsList) {
        super(restaurant, user, paymentStrategy, menuItemsList, OrderType.PICKUP_ORDER.toString());
    }

}
