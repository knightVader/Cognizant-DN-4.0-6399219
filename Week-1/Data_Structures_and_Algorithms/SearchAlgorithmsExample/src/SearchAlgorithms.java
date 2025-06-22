package SearchAlgorithmsExample.src;

public class SearchAlgorithms {
    
    // Linear Search - O(n) time complexity
    public static Product linearSearch(Product[] products, int searchId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId() == searchId) {
                return products[i];
            }
        }
        return null;
    }

    // Binary Search - O(log n) time complexity
    public static Product binarySearch(Product[] products, int searchId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (products[mid].getProductId() == searchId) {
                return products[mid];
            }
            
            if (products[mid].getProductId() < searchId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
