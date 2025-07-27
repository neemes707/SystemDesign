package LowLevelDesignProblems.FoodDeliveryApp.strategy;

import LowLevelDesignProblems.FoodDeliveryApp.models.Restaurant;

import java.util.List;

public interface RestaurantSearchingStrategy {
    List<Restaurant> searchRestaurant(String criteria);
}
