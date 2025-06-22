public class Logger {
    // Private static instance of the class
    private static Logger instance;
    
    // Private constructor to prevent instantiation
    private Logger() {
        // Private constructor implementation
    }
    
    // Public static method to get the instance
    public static Logger getInstance() {
        // Create the instance if it doesn't exist (lazy initialization)
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    // Method to log messages
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
