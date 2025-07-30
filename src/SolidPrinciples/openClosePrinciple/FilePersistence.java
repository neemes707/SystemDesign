package SolidPrinciples.openClosePrinciple;

public class FilePersistence implements Persistence{
    private Invoice invoice;
    public FilePersistence(Invoice invoice){
        this.invoice = invoice;
    }
    @Override
    public void save(){
        System.out.println("save in file");
    }
}
