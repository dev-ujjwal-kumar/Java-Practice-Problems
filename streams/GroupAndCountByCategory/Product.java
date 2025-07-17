public class Product {
    String name;
    String category;
    int price;

    Product(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getCategory(){
        return category;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "Name: " + name + 
        " Category: " + category + 
        " Price: " + price;
    }
}