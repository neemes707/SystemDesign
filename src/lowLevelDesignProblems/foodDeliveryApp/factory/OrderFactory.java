package lowLevelDesignProblems.foodDeliveryApp.factory;

import lowLevelDesignProblems.foodDeliveryApp.enums.OrderType;
import lowLevelDesignProblems.foodDeliveryApp.service.DeliveryOrder;
import lowLevelDesignProblems.foodDeliveryApp.service.Order;
import lowLevelDesignProblems.foodDeliveryApp.service.PickupOrder;
import lowLevelDesignProblems.foodDeliveryApp.service.User;
import lowLevelDesignProblems.foodDeliveryApp.strategy.PaymentStrategy;

import java.util.Objects;

public class OrderFactory {
    public static Order createOrder(OrderType orderType, User user, PaymentStrategy paymentStrategy){
        if (Objects.equals(OrderType.DELIVERY_ORDER.toString(), orderType.toString())) {
            return new DeliveryOrder(user.getCart().getRestaurant(), user,paymentStrategy,user.getCart().getMenuItemsList()
            , user.getAddress());

        } else if(Objects.equals(OrderType.PICKUP_ORDER.toString(), orderType.toString())){
            return new PickupOrder(user.getCart().getRestaurant(),user,paymentStrategy,user.getCart().getMenuItemsList());
        } else{
            return null;
        }
    }

}
