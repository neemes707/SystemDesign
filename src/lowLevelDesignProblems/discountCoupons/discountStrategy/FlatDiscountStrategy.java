package lowLevelDesignProblems.discountCoupons.discountStrategy;

import lowLevelDesignProblems.discountCoupons.Cart;

public class FlatDiscountStrategy implements DiscountStrategy{
    private double discount;

    public FlatDiscountStrategy(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double getDiscount(Cart cart) {
        return Math.min(cart.getFinalPrice(), discount);
    }
}
