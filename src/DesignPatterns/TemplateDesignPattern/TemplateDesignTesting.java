package DesignPatterns.TemplateDesignPattern;

public class TemplateDesignTesting {
    public static void main(String[] args) {
        ModelTrainer newralModelTrainer = new NeuralModelTrainer();
        newralModelTrainer.trainPipeline("c/files/tainer.txt");

        System.out.println();

        ModelTrainer agentModelTrainer = new AgentModelTrainer();
        agentModelTrainer.trainPipeline("c/desktop/agentic.txt");
    }
}
