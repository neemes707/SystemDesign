package lowLevelDesignProblems.foodDeliveryApp.service;

import lowLevelDesignProblems.foodDeliveryApp.enums.OrderType;
import lowLevelDesignProblems.foodDeliveryApp.models.MenuItems;
import lowLevelDesignProblems.foodDeliveryApp.models.Restaurant;
import lowLevelDesignProblems.foodDeliveryApp.strategy.PaymentStrategy;

import java.util.List;

public class DeliveryOrder extends Order{
    String deliveryAddress;
    public DeliveryOrder(Restaurant restaurant, User user, PaymentStrategy paymentStrategy, List<MenuItems> menuItemsList,String deliveryAddress) {
        super(restaurant, user, paymentStrategy, menuItemsList, OrderType.DELIVERY_ORDER.toString());
        this.deliveryAddress = deliveryAddress;
    }


}
