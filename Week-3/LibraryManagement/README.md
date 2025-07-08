# Library Management - Spring Application

This project is a basic Spring Framework application for managing a library. It demonstrates how to set up a simple backend using Spring Core, configure beans using XML, and perform dependency injection.

## Project Structure

```
LibraryManagement/
├── pom.xml
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── library/
│       │           ├── LibraryApplication.java
│       │           ├── repository/
│       │           │   └── BookRepository.java
│       │           └── service/
│       │               └── BookService.java
│       └── resources/
│           └── applicationContext.xml
└── .vscode/
    └── tasks.json
```

## Steps Performed

### 1. Maven Project Setup
- **pom.xml**: Configured as a Maven project with dependencies for Spring Core, Spring Context, Spring AOP, and Spring WebMVC. The Maven Compiler Plugin is set for Java 1.8. This allows us to use Spring's core features, AOP, web MVC, and dependency injection.

### 2. Application Context Configuration
- **applicationContext.xml**: XML file in `src/main/resources` that defines beans for `BookService` and `BookRepository`. This file tells Spring how to create and wire these objects.

### 3. Implementing Dependency Injection (DI) with Spring
This project demonstrates how to use Spring's Inversion of Control (IoC) container to manage dependencies between components using Dependency Injection (DI):

#### a. Define Beans in XML
- In `applicationContext.xml`, both `BookRepository` and `BookService` are declared as beans.
- The `BookService` bean is configured with a `<property>` tag to inject the `BookRepository` bean via its setter method:
  ```xml
  <bean id="bookRepository" class="com.library.repository.BookRepository"/>
  <bean id="bookService" class="com.library.service.BookService">
      <property name="bookRepository" ref="bookRepository"/>
  </bean>
  ```

#### b. Setter Injection in Service Class
- In `BookService.java`, a setter method `setBookRepository(BookRepository bookRepository)` is provided.
- Spring uses this setter to inject the `BookRepository` bean when creating the `BookService` bean.

#### c. Using the Beans in the Application
- In `LibraryApplication.java`, the Spring context is loaded from `applicationContext.xml`:
  ```java
  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
  BookService bookService = context.getBean("bookService", BookService.class);
  ```
- The `BookService` bean is retrieved and used to fetch a book, demonstrating that the dependency was injected by Spring.

### 4. Service and Repository Classes
- **BookRepository**: A simple repository class with a method to get a book by ID (dummy implementation).
- **BookService**: A service class that depends on `BookRepository`. It uses a setter for dependency injection.

### 5. Main Application
- **LibraryApplication**: The entry point. Loads the Spring context from `applicationContext.xml`, retrieves the `BookService` bean, and calls its method to fetch a book.

### 6. VS Code Task
- **.vscode/tasks.json**: Added a task to easily run the application using Maven from within VS Code.

## Maven Dependencies and Plugins

The `pom.xml` now includes:

- **Spring Core**
- **Spring Context**
- **Spring AOP**
- **Spring WebMVC**
- **Maven Compiler Plugin** (configured for Java 1.8)

Example snippet from `pom.xml`:
```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-aop</artifactId>
    <version>${spring.version}</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>${spring.version}</version>
</dependency>
...
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.8.1</version>
            <configuration>
                <source>1.8</source>
                <target>1.8</target>
            </configuration>
        </plugin>
    </plugins>
</build>
```
## How It Works
- Spring loads the beans defined in `applicationContext.xml`.
- `BookService` is injected with an instance of `BookRepository` using setter injection.
- The main method fetches a book using the service, demonstrating that dependency injection is working.

## Output
When you run the application, you should see the following output in the console:

```
Found book: Sample Book with ID: 123
```

This confirms that the Spring context is set up correctly and the beans are wired as expected.