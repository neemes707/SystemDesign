package designPatterns.templateDesignPattern;

public class AgentModelTrainer implements ModelTrainer{
    @Override
    public void trainModel() {
        System.out.println("Model trained through Agent method");
    }

    @Override
    public void evaluateModel() {
        System.out.println("Model evaluated through Agent method");
    }
}
