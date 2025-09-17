package JavaClassObjectPracticeLevel1;


public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter & Setter
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    // Methods
    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.printf("Area of Circle: %.4f%n", area());
        System.out.printf("Circumference of Circle: %.4f%n", circumference());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        circle.displayDetails();
    }
}

