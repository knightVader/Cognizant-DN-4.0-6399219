# SingletonPatternExample

## Overview
This project demonstrates the Singleton Design Pattern in Java by implementing a `Logger` utility class. The Singleton pattern ensures that a class has only one instance throughout the application lifecycle and provides a global point of access to it. This is particularly useful for classes like loggers, configuration managers, or connection pools.

## Project Structure
```
SingletonPatternExample/
└── src/
    ├── Logger.java
    └── SingletonTest.java
```

## Logger.java
This class implements the Singleton pattern for a logging utility. Here’s how it works:

- **Private Static Instance:**
  ```java
  private static Logger instance;
  ```
  This static variable holds the single instance of the Logger class.

- **Private Constructor:**
  ```java
  private Logger() { }
  ```
  The constructor is private to prevent direct instantiation from outside the class.

- **Public Static getInstance() Method:**
  ```java
  public static Logger getInstance() {
      if (instance == null) {
          instance = new Logger();
      }
      return instance;
  }
  ```
  This method returns the single instance of Logger. If it doesn't exist yet, it creates one (lazy initialization).

- **Logging Method:**
  ```java
  public void log(String message) {
      System.out.println("LOG: " + message);
  }
  ```
  This method prints log messages to the console.

## SingletonTest.java
This class tests the Singleton implementation:

- It retrieves two references to the Logger instance using `Logger.getInstance()`.
- It checks if both references point to the same object (using `==` and hash codes).
- It demonstrates logging from both references.

**Sample Output:**
```
Checking if logger1 and logger2 are the same instance:
logger1 hash code: 12345678
logger2 hash code: 12345678
Are logger1 and logger2 the same instance? true
LOG: This is a test message from logger1
LOG: This is a test message from logger2
```

## Key Points
- Only one instance of Logger is created and used throughout the application.
- The Singleton pattern is implemented using lazy initialization.
- The constructor is private to prevent external instantiation.
- The `getInstance()` method provides global access to the instance.

## How to Run
1. Open a terminal in the `src` directory.
2. Compile the Java files:
   ```powershell
   javac *.java
   ```
3. Run the test:
   ```powershell
   java SingletonTest
   ```

## Notes
- This implementation is not thread-safe. For multi-threaded applications, consider synchronizing the `getInstance()` method.
- The pattern is ideal for shared resources like loggers, configuration, or caches.
