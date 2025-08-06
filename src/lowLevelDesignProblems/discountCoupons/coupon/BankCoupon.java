package lowLevelDesignProblems.discountCoupons.coupon;

import lowLevelDesignProblems.discountCoupons.Cart;
import lowLevelDesignProblems.discountCoupons.discountStrategy.DiscountStrategy;

public class BankCoupon implements Coupon{
    private Coupon nextCoupon;
    private DiscountStrategy discountStrategy;

    public BankCoupon(Coupon nextCoupon, DiscountStrategy discountStrategy) {
        this.nextCoupon = nextCoupon;
        this.discountStrategy = discountStrategy;
    }

    @Override
    public boolean isApplicable(Cart cart) {
        return (cart.getBankName().equalsIgnoreCase("HDFC"));
    }

    @Override
    public boolean isCombinable(Cart cart) {
        return false;
    }

    @Override
    public double getDiscount(Cart cart) {
        return discountStrategy.getDiscount(cart);
    }

    @Override
    public void applyDiscount(Cart cart) {
        if(isApplicable(cart)){
            cart.setFinalPrice(cart.getFinalPrice() - getDiscount(cart));
        }
        if(nextCoupon != null && isCombinable(cart)){
            nextCoupon.applyDiscount(cart);
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Bank Coupon");
    }

    @Override
    public Coupon getNextCoupon() {
        return nextCoupon;
    }
}
