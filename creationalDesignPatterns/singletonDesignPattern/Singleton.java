package singletonDesignPattern;

public class Singleton {

    private static volatile Singleton instance = null;

    private Singleton() {
        System.out.println("Singleton constructor called!");
    }

    public static Singleton getInstance() {
        if (instance == null) { // Check if already created
            synchronized (Singleton.class) {
                if (instance == null) { // Double-checking to handle multiple threads case
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}