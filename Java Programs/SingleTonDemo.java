class Singleton {
    // 1. Private static variable to hold the single instance
    private static Singleton instance;

    // 2. Private constructor so no one else can use 'new Singleton()'
    private Singleton() {
        System.out.println("Singleton Instance Created!");
    }

    // 3. Public static method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from the Singleton!");
    }
}

// Main class to test
public class SingleTonDemo {
    public static void main(String[] args) {
        // You cannot do: Singleton obj = new Singleton(); (Compiler error)

        // Get the only instance available
        Singleton first = Singleton.getInstance();
        first.showMessage();

        // Get it again
        Singleton second = Singleton.getInstance();

        // Check if they are the exact same object in memory
        System.out.println("Are both instances the same? " + (first == second));
    }
}