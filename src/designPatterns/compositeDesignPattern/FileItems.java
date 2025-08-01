package designPatterns.compositeDesignPattern;

public interface FileItems {
    void ls();
    void openAll();
    void cd(String fileName);
    double calculateSize();
    String getName();
}
