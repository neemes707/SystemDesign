package lowLevelDesignProblems.discountCoupons.discountStrategy;

import lowLevelDesignProblems.discountCoupons.Cart;

public class PercentDiscountStrategy implements DiscountStrategy{
    private double percentDiscount;

    public PercentDiscountStrategy(double percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    public double getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(double percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    @Override
    public double getDiscount(Cart cart) {
        return (percentDiscount * cart.getFinalPrice() ) / 100;
    }
}
