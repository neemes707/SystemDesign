package designPatterns.singletonDesignPattern.BillPugh;

public class TestBillPugh {
    public static void main(String[] args) {
        BillPughSingleton obj = BillPughSingleton.getInstance();
        System.out.println(obj);
    }
}
