package singletonDesignPattern;

/**
 * Output:
 * Singleton constructor called!
 * // Constructor called only once, even though getInstance is called thrice
 * 
 * Hashcode for instance 1: 1705736037
 * Hashcode for instance 2: 1705736037
 * Hashcode for instance 3: 1705736037
 * // Hashcodes for all instances is same, implies same object is received
 */
public class SingletonTest {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        System.out.println("Hashcode for instance 1: " + instance1.hashCode());
        System.out.println("Hashcode for instance 2: " + instance2.hashCode());
        System.out.println("Hashcode for instance 3: " + instance3.hashCode());

    }

}