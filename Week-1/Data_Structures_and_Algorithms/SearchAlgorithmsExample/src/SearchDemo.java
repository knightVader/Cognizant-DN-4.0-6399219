package SearchAlgorithmsExample.src;

import java.util.Arrays;

public class SearchDemo {
    public static void main(String[] args) {
        // Create sample products
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Book", "Books"),
            new Product(4, "Table", "Furniture"),
            new Product(5, "Chair", "Furniture")
        };

        System.out.println("E-commerce Platform Search Function Demo");
        System.out.println("---------------------------------------");

        // Linear Search Demo
        System.out.println("\nLinear Search Demo:");
        long startTime = System.nanoTime();
        Product foundProduct = SearchAlgorithms.linearSearch(products, 3);
        long endTime = System.nanoTime();
        
        System.out.println("Searching for product with ID 3");
        if (foundProduct != null) {
            System.out.println("Found: " + foundProduct);
        } else {
            System.out.println("Product not found");
        }
        System.out.println("Linear Search Time: " + (endTime - startTime) + " nanoseconds");

        // Sort products for Binary Search
        Arrays.sort(products);

        // Binary Search Demo
        System.out.println("\nBinary Search Demo:");
        startTime = System.nanoTime();
        foundProduct = SearchAlgorithms.binarySearch(products, 3);
        endTime = System.nanoTime();

        System.out.println("Searching for product with ID 3");
        if (foundProduct != null) {
            System.out.println("Found: " + foundProduct);
        } else {
            System.out.println("Product not found");
        }
        System.out.println("Binary Search Time: " + (endTime - startTime) + " nanoseconds");

        System.out.println("\nSearch Algorithm Analysis:");
        System.out.println("- Linear Search (O(n)): Best for small datasets or unsorted data");
        System.out.println("- Binary Search (O(log n)): Best for large sorted datasets");
        System.out.println("\nFor an e-commerce platform with a large number of products,");
        System.out.println("Binary Search would be more efficient, but requires keeping the data sorted.");
    }
}
