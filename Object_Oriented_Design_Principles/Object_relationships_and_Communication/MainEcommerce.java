import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    List<Product> products;

    Order() {
        products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void showOrder() {
        double total = 0;
        System.out.println("Order Details:");
        for (Product p : products) {
            System.out.println("- " + p.name + ": $" + p.price);
            total += p.price;
        }
        System.out.printf("Total: $%.2f\n", total);
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        System.out.println(name + " placed an order:");
        order.showOrder();
    }
}

public class MainEcommerce {
    public static void main(String[] args) {
        Customer c = new Customer("Alice");

        Product p1 = new Product("Laptop", 1200.00);
        Product p2 = new Product("Mouse", 25.50);
        Product p3 = new Product("Keyboard", 45.99);

        Order order = new Order();
        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);

        c.placeOrder(order);
    }
}
