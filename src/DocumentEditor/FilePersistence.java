package DocumentEditor;

public class FilePersistence implements Persistence{
    @Override
    public void save() {
        System.out.println("Saved in fle");
    }
}
