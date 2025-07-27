package LowLevelDesignProblems.FoodDeliveryApp.factory;

import LowLevelDesignProblems.FoodDeliveryApp.enums.OrderType;
import LowLevelDesignProblems.FoodDeliveryApp.service.DeliveryOrder;
import LowLevelDesignProblems.FoodDeliveryApp.service.Order;
import LowLevelDesignProblems.FoodDeliveryApp.service.PickupOrder;
import LowLevelDesignProblems.FoodDeliveryApp.service.User;
import LowLevelDesignProblems.FoodDeliveryApp.strategy.PaymentStrategy;

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
