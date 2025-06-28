// You are given a list of Product objects. 
// Each product has a name, category, and price. 
// Use Java Streams to group the products by category and count how many products are in each category.

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductManager {
    public static void main(String[] args) {
        List<Product> products = List.of(
            new Product("iPhone", "Electronics", 90000),
            new Product("TV", "Electronics", 40000),
            new Product("Shirt", "Clothing", 1500),
            new Product("Jeans", "Clothing", 2000),
            new Product("Laptop", "Electronics", 120000)
        );

        // using method reference
        Map<String, Long> categoryCount = products.stream()
                                            .collect(Collectors.groupingBy(Product::getCategory,
                                            Collectors.counting()));
        
        // using lambda expression
        Map<String, Long> categoryCountUsingLE = products.stream()
                                            .collect(Collectors.groupingBy(product -> product.getCategory(),
                                            Collectors.counting()));


        System.out.println(categoryCount);
        
        System.out.println(categoryCountUsingLE);
    }
    
}
