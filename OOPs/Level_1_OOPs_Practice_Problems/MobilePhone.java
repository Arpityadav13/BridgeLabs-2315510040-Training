package JavaClassObjectPracticeLevel1;


public class MobilePhone {
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Getters
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getPrice() { return price; }

    // Setters
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setPrice(double price) { this.price = price; }

    public void displayMobile() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone("Vivo", "Vivo V29", 15999);
        MobilePhone m2 = new MobilePhone("OnePlus", "Nord 4", 39999);
        MobilePhone m3 = new MobilePhone("Apple", "iPhone 16 Pro", 79999);

        m1.displayMobile();
        m2.displayMobile();
        m3.displayMobile();
    }
}
