package DesignPatterns.TemplateDesignPattern;

public interface ModelTrainer {
    default void loadData(String path){
        System.out.println("Loading dataset from path : " + path);
    }

    default void preProcessData(){
        System.out.println("Processed loaded data");
    }

    void trainModel();
    void evaluateModel();

    default void saveModel(){
        System.out.println("Saved model finally");
    }
    default void trainPipeline(String dataPath){
        loadData(dataPath);
        preProcessData();
        trainModel();
        evaluateModel();
        saveModel();
    }
}
