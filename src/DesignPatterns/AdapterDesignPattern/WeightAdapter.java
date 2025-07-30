package DesignPatterns.AdapterDesignPattern;

public class WeightAdapter implements WeightReport{
    private Adaptee adaptee;

    @Override
    public double getWeightInKg() {
        return adaptee.getWeightInPounds() * 0.75;
    }
}
