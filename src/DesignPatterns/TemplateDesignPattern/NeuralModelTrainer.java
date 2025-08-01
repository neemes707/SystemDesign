package DesignPatterns.TemplateDesignPattern;
/** We use template method pattern when we want our concrete classes to implement method in certain defined pipeline (or
 * we can save when want that methods must be used in proper order) i.e some concrete class should not change the order
 * of execution of methods therefore we define a method which invoke all the methods in proper order and this is
 * implemented in interface rest all the methods or some methods which we want we can ask the concrete implementation to
 * implement those methods*/
public class NeuralModelTrainer implements ModelTrainer{
    @Override
    public void trainModel() {
        System.out.println("Data trained through Neural Model Trainer");
    }

    @Override
    public void evaluateModel() {
        System.out.println("Model evaluated through Neural Model Trainer");
    }
}
