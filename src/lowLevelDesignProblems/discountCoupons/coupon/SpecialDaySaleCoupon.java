package lowLevelDesignProblems.discountCoupons.coupon;

import lowLevelDesignProblems.discountCoupons.Cart;
import lowLevelDesignProblems.discountCoupons.discountStrategy.DiscountStrategy;

public class SpecialDaySaleCoupon implements Coupon{
    private Coupon nextCoupon;
    private DiscountStrategy discountStrategy;

    public SpecialDaySaleCoupon(Coupon nextCoupon, DiscountStrategy discountStrategy) {
        this.nextCoupon = nextCoupon;
        this.discountStrategy = discountStrategy;
    }

    public Coupon getNextCoupon() {
        return nextCoupon;
    }

    public void setNextCoupon(Coupon nextCoupon) {
        this.nextCoupon = nextCoupon;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    @Override
    public boolean isApplicable(Cart cart) {
        return true;
    }

    @Override
    public boolean isCombinable(Cart cart) {
        return true;
    }

    @Override
    public double getDiscount(Cart cart) {
        return discountStrategy.getDiscount(cart);
    }

    @Override
    public void applyDiscount(Cart cart) {
        if(isApplicable(cart)){
            cart.setFinalPrice(cart.getTotalPrice() - getDiscount(cart));
        }
        if(nextCoupon != null && isCombinable(cart)){
            nextCoupon.applyDiscount(cart);
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Special Day coupon");
    }
}
