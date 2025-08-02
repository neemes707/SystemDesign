package lowLevelDesignProblems.foodDeliveryApp.strategy;

import lowLevelDesignProblems.foodDeliveryApp.models.Restaurant;

import java.util.List;

public interface RestaurantSearchingStrategy {
    List<Restaurant> searchRestaurant(String criteria);
}
