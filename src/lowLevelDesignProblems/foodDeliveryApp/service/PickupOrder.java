package lowLevelDesignProblems.foodDeliveryApp.service;

import lowLevelDesignProblems.foodDeliveryApp.enums.OrderType;
import lowLevelDesignProblems.foodDeliveryApp.models.MenuItems;
import lowLevelDesignProblems.foodDeliveryApp.models.Restaurant;
import lowLevelDesignProblems.foodDeliveryApp.strategy.PaymentStrategy;

import java.util.List;

public class PickupOrder extends Order{
    public PickupOrder(Restaurant restaurant, User user, PaymentStrategy paymentStrategy, List<MenuItems> menuItemsList) {
        super(restaurant, user, paymentStrategy, menuItemsList, OrderType.PICKUP_ORDER.toString());
    }

}
