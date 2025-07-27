package LowLevelDesignProblems.FoodDeliveryApp.service;

import LowLevelDesignProblems.FoodDeliveryApp.enums.OrderType;
import LowLevelDesignProblems.FoodDeliveryApp.models.MenuItems;
import LowLevelDesignProblems.FoodDeliveryApp.models.Restaurant;
import LowLevelDesignProblems.FoodDeliveryApp.strategy.PaymentStrategy;

import java.util.List;

public class DeliveryOrder extends Order{
    String deliveryAddress;
    public DeliveryOrder(Restaurant restaurant, User user, PaymentStrategy paymentStrategy, List<MenuItems> menuItemsList,String deliveryAddress) {
        super(restaurant, user, paymentStrategy, menuItemsList, OrderType.DELIVERY_ORDER.toString());
        this.deliveryAddress = deliveryAddress;
    }


}
