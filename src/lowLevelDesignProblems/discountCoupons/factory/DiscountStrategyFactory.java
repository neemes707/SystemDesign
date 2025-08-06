package lowLevelDesignProblems.discountCoupons.factory;

import lowLevelDesignProblems.discountCoupons.discountStrategy.DiscountStrategy;
import lowLevelDesignProblems.discountCoupons.discountStrategy.FlatDiscountStrategy;
import lowLevelDesignProblems.discountCoupons.discountStrategy.PercentDiscountStrategy;
import lowLevelDesignProblems.enums.DiscountStrategyType;

public class DiscountStrategyFactory{
    public static DiscountStrategy getDiscountStrategy(DiscountStrategyType type){
        if(type == DiscountStrategyType.PERCENT){
            return new PercentDiscountStrategy(10);
        }else if(type == DiscountStrategyType.FLAT){
            return new FlatDiscountStrategy(500);
        }
        return null;
    }
}
