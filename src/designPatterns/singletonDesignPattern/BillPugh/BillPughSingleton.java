package designPatterns.singletonDesignPattern.BillPugh;

public class BillPughSingleton {
    private BillPughSingleton(){}

    public static BillPughSingleton getInstance(){
        return BillPughSingletonHelper.INSTANCE;
    }

    /** Note - The helper class is not initialized first it only gets initialized once we call the getInstance()
     * method for the first time so the JVM initializes it. Now if 2 threads are there calling getInstance() so JVM itself
     * makes it thread safe as class initialization is thread safe. So no need of synchronized
     * 2. Since INSTANCE variable is static so it is executed only once as it is the property of the class and gets executed
     * once the class is initialized and not everytime the getInstance() method is called
     */
    private static class BillPughSingletonHelper{
        public static BillPughSingleton INSTANCE = new BillPughSingleton();
    }
}
