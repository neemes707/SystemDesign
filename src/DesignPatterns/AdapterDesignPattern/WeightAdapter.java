package DesignPatterns.AdapterDesignPattern;

public class WeightAdapter implements WeightReport{
    private Adaptee adaptee;

    @Override
    public double getWeightInKg(int weight) {
        return adaptee.getWeightInPounds(weight) * 0.75;
    }
}
