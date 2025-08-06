package lowLevelDesignProblems.discountCoupons.discountStrategy;

import lowLevelDesignProblems.discountCoupons.Cart;

public interface DiscountStrategy {
    double getDiscount(Cart cart);
}
