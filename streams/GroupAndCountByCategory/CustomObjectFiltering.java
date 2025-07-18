// Filter products with price greater than ₹50,000, 
// convert their names to uppercase, and collect their names into a List of Strings.

import java.util.List;
import java.util.stream.Collectors;

public class CustomObjectFiltering {
    public static void main(String[] args) {
        List<Product> products = List.of(
            new Product("iPhone", "Electronics", 90000),
            new Product("TV", "Electronics", 40000),
            new Product("Shirt", "Clothing", 1500),
            new Product("Jeans", "Clothing", 2000),
            new Product("Laptop", "Electronics", 120000)
        );

        List<String> productNameList = products.stream()
        .filter(product -> product.getPrice()>50000)
        .map(product -> product.getName().toUpperCase())
        .collect(Collectors.toList());

        // using method reference
        products.stream()
        .filter(product -> product.getPrice() > 50000)
        .map(Product::getName)
        .map(String::toUpperCase)
        .collect(Collectors.toList());

        System.out.println(productNameList);
    }
}
