package LowLevelDesignProblems.DocumentEditor;

public class DbPersistence implements Persistence{
    @Override
    public void save() {
        System.out.println("Saved in DB");
    }
}
