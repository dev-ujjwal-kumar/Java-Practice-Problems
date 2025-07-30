// You are given a list of Product objects. 
// Each product has a name, category, and price. 
// Use Java Streams to group the products by category and count how many products are in each category.

import java.lang.StackWalker.Option;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
        
        Map<String, List<Product>> productCategory = products.stream()
                                            .collect(Collectors.groupingBy(Product::getCategory));
        
        //  list of all products which is greater than and less than 50K.
        Map<Boolean, List<Product>> partationedByPrice = products.stream()
                                            .collect(Collectors.partitioningBy(product -> product.getPrice() < 50000));
        
        
        System.out.println(partationedByPrice);
        
        productCategory.forEach((category, productList) -> {
                System.out.println("Category: " + category);
                productList.forEach(System.out::println);
            });

        System.out.println(categoryCount);


        System.out.println(categoryCountUsingLE);

        // Use Java Streams to group the products by department, 
        // and for each department, find the prodct with the highest salary.
        
        Map<String , Optional<Product>> highestPricePerCategory = products.stream()
                                                            .collect(Collectors.groupingBy(Product::getCategory,
                                                            Collectors.maxBy(Comparator.comparingInt(Product::getPrice))));
        
        System.out.println(highestPricePerCategory);

        // Using Java Streams, group the products by their category and compute the average price for each category.
        Map<String, Double> averageProduct = products.stream() 
                                            .collect(Collectors.groupingBy(Product::getCategory, 
                                            Collectors.averagingInt(Product::getPrice)));
                                            
        System.out.println(averageProduct);

        // top 3 most expensive product
        List<String> productList = products.stream()
                                    .sorted(Comparator.comparingInt(Product::getPrice).reversed())
                                    .limit(3)
                                    .map(Product::getName)
                                    .collect(Collectors.toList());

        System.out.println(productList);
    
    }
    
}
