package DesignPatterns.CompositeDesignPattern;

import java.util.List;

public class Folders implements FileItems{
    private String name;
    private List<FileItems> folderItemsList;
    public Folders(String name,List<FileItems> folderItemsList){
        this.name = name;
        this.folderItemsList = folderItemsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FileItems> getFolderItemsList() {
        return folderItemsList;
    }

    public void setFolderItemsList(List<FileItems> folderItemsList) {
        this.folderItemsList = folderItemsList;
    }

    @Override
    public void ls() {
        for(FileItems items : folderItemsList){
            System.out.println(items.getName());
        }
    }

    @Override
    public void openAll() {
        System.out.println(name);
        for(FileItems items : folderItemsList){
            items.openAll();
        }
    }

    @Override
    public void cd(String fileName) {
        for (FileItems items : folderItemsList){
            if(items.getName().contains(fileName)){
                System.out.println("File changed to " + fileName);
                break;
            }
        }
    }

    @Override
    public double calculateSize() {
        double totalSize = 0;
        for(FileItems items : folderItemsList){
            totalSize += items.calculateSize();
        }
        return totalSize;
    }
}
