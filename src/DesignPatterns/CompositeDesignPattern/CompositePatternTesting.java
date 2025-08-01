package DesignPatterns.CompositeDesignPattern;

import com.sun.deploy.security.BadCertificateDialog;

import java.util.ArrayList;
import java.util.List;

public class CompositePatternTesting {
    public static void main(String[] args) {
        FileItems resume = new File("resume.pdf",4);
        FileItems offerLetter = new File("offer.pdf",8);
        List<FileItems> fileItemsList = new ArrayList<>();
        fileItemsList.add(resume);
        fileItemsList.add(offerLetter);

        FileItems folder1 = new Folders("documents",fileItemsList);

        FileItems adhaarCard = new File("adhaar.pdf",1);
        FileItems panCard = new File("pan.pdf",5);


        List<FileItems> fileItems = new ArrayList<>();
        fileItems.add(folder1);
        fileItems.add(adhaarCard);
        fileItems.add(panCard);

        FileItems rootFolder = new Folders("personal-documents",fileItems);

        rootFolder.ls();
        rootFolder.openAll();
        rootFolder.calculateSize();
        rootFolder.cd("resume");

        folder1.ls();


    }
}
