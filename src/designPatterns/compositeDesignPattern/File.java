package designPatterns.compositeDesignPattern;

public class File implements FileItems{
    private String name;
    private double size;
    public File(String name,double size){
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(name);
    }

    @Override
    public void openAll() {
        System.out.println(name);
    }

    @Override
    public void cd(String fileName) {
        System.out.println("Not possible in case of file");
    }

    @Override
    public double calculateSize() {
        return getSize();
    }
}
