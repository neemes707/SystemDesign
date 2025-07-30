package DesignPatterns.AdapterDesignPattern;

public class Client {
    public static void main(String[] args) {
        WeightReport weightReport = new WeightAdapter();
        System.out.println(weightReport.getWeightInKg(100));
    }
}
