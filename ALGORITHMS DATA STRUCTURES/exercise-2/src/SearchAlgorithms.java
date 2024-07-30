import java.util.Arrays;

public class SearchAlgorithms {

    // Linear Search
    public static Product linearSearch(Product[] products, int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int productId) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId() == productId) {
                return products[mid];
            }
            if (products[mid].getProductId() < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Book", "Education")
        };

        // Linear search
        Product result = linearSearch(products, 2);
        if (result != null) {
            System.out.println("Product found: " + result.getProductName());
        } else {
            System.out.println("Product not found.");
        }

        // Sort the array for binary search
        Arrays.sort(products, (a, b) -> a.getProductId() - b.getProductId());

        // Binary search
        result = binarySearch(products, 2);
        if (result != null) {
            System.out.println("Product found: " + result.getProductName());
        } else {
            System.out.println("Product not found.");
        }
    }
}
