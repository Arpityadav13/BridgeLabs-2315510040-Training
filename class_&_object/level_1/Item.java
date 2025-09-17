package JavaClassObjectPracticeLevel1;


public class Item {
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Getters
    public String getItemCode() { return itemCode; }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }

    // Setters
    public void setItemCode(String itemCode) { this.itemCode = itemCode; }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setPrice(double price) { this.price = price; }

    // Display method
    public void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Item[] items = {
            new Item("01AA", "Water Bottle", 500),
            new Item("01BB", "Rice", 700),
            new Item("02AA", "Blackboard", 400)
        };

        for (Item i : items) {
            i.displayItem();
        }
    }
}

