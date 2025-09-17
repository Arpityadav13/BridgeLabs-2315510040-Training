abstract class FoodItem {
    protected String itemName;
    protected double price;
    protected int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount(double percentage);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return price * quantity;
    }

    public double applyDiscount(double percentage) {
        return calculateTotalPrice() * (1 - percentage / 100);
    }

    public String getDiscountDetails() {
        return "Veg items eligible for up to 10% discount";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double nonVegCharge = 20;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (price * quantity) + nonVegCharge;
    }

    public double applyDiscount(double percentage) {
        return calculateTotalPrice() * (1 - percentage / 100);
    }

    public String getDiscountDetails() {
        return "Non-Veg items eligible for up to 5% discount";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer Butter Masala", 150, 2),
            new NonVegItem("Chicken Biryani", 200, 1)
        };

        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());
            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println("Discounted Price (10%): " + d.applyDiscount(10));
                System.out.println(d.getDiscountDetails());
            }
            System.out.println();
        }
    }
}
