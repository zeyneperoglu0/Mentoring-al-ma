package Kasım23;

public class Singleton {


    private static Singleton instance;

    private Singleton() {               // private constructor!
        System.out.println("Singleton instance created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }











}
