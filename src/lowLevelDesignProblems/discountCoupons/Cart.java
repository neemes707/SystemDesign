package lowLevelDesignProblems.discountCoupons;

import lowLevelDesignProblems.discountCoupons.coupon.Coupon;
import lowLevelDesignProblems.discountCoupons.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> cartItemList;
    private boolean isPremiumCustomer;
    private double totalPrice;
    private double finalPrice;
    private String bankName;
    private Coupon coupon;
    public Cart(){}
    public Cart( boolean isPremiumCustomer,String bankName) {
        this.cartItemList = new ArrayList<>();
        this.isPremiumCustomer = isPremiumCustomer;
        this.bankName = bankName;
    }

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }

    public boolean isPremiumCustomer() {
        return isPremiumCustomer;
    }

    public void setPremiumCustomer(boolean premiumCustomer) {
        isPremiumCustomer = premiumCustomer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public double calculateAndSetTotalPrice(){
        double price = 0;
        for(CartItem cartItem : cartItemList){
            price += cartItem.calculateCartPrice();
        }
        totalPrice = price;
        finalPrice = price;
        return price;
    }

    public void addProduct(Product product,int quantity){
        cartItemList.add(new CartItem(product,quantity));
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public double getDiscount(){
        return coupon.getDiscount(this);
    }

    public void applyAllCoupon(){
        coupon.applyDiscount(this);
    }

    public void showAllApplicableCoupons(){
        Coupon temp = coupon;
        while(temp != null){
            temp.printInfo();
            temp = temp.getNextCoupon();
        }
    }
}
