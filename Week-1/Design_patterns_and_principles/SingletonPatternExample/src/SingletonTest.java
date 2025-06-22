public class SingletonTest {
    public static void main(String[] args) {
        // Get Logger instances
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        // Test if both references point to the same object
        System.out.println("Checking if logger1 and logger2 are the same instance:");
        System.out.println("logger1 hash code: " + logger1.hashCode());
        System.out.println("logger2 hash code: " + logger2.hashCode());
        System.out.println("Are logger1 and logger2 the same instance? " + (logger1 == logger2));
        
        // Test logging functionality
        logger1.log("This is a test message from logger1");
        logger2.log("This is a test message from logger2");
    }
}
