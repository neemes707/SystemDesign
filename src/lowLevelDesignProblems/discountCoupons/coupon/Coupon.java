package lowLevelDesignProblems.discountCoupons.coupon;

import lowLevelDesignProblems.discountCoupons.Cart;

public interface Coupon {

    boolean isApplicable(Cart cart);
    boolean isCombinable(Cart cart);
    double getDiscount(Cart cart);
    void applyDiscount(Cart cart);
    void printInfo();
    Coupon getNextCoupon();

}
