package lowLevelDesignProblems.discountCoupons;

import lowLevelDesignProblems.discountCoupons.coupon.BankCoupon;
import lowLevelDesignProblems.discountCoupons.coupon.Coupon;
import lowLevelDesignProblems.discountCoupons.coupon.SeasonalCoupon;
import lowLevelDesignProblems.discountCoupons.coupon.SpecialDaySaleCoupon;
import lowLevelDesignProblems.discountCoupons.factory.DiscountStrategyFactory;
import lowLevelDesignProblems.discountCoupons.model.Product;
import lowLevelDesignProblems.enums.DiscountStrategyType;

public class DiscountCouponTesting {
    public static void main(String[] args) {


        Coupon bankCoupon = new BankCoupon(null,
                DiscountStrategyFactory.getDiscountStrategy(DiscountStrategyType.FLAT));
        Coupon  seasonCoupon = new SeasonalCoupon(bankCoupon,
                DiscountStrategyFactory.getDiscountStrategy(DiscountStrategyType.PERCENT));
        Coupon specialSaleCoupon = new SpecialDaySaleCoupon(seasonCoupon,
                DiscountStrategyFactory.getDiscountStrategy(DiscountStrategyType.FLAT));


        Product jeans = new Product("Jeans","fashion",2000);
        Product shirt = new Product("Shirt","fashion",1500);
        Product phone = new Product("Mobile Phone","Electronics",20000);

        Cart cart = new Cart(true,"HDFC");
        cart.addProduct(jeans,2);
        cart.addProduct(phone,1);
        cart.addProduct(shirt,3);

        cart.calculateAndSetTotalPrice();  // calculates and sets total price of cart

        cart.setCoupon(specialSaleCoupon);

        cart.showAllApplicableCoupons();
        System.out.println();
        cart.applyAllCoupon();
        System.out.println("Final Price before discount " + cart.getTotalPrice());
        System.out.println("Final Price after applying all discounts " + cart.getFinalPrice());
    }
}
