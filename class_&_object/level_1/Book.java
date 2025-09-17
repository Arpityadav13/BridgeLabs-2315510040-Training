package JavaClassObjectPracticeLevel1;


public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPrice(double price) { this.price = price; }

    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("2 States", "Chetan Bhagat", 500);
        Book b2 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 600);

        b1.displayBookDetails();
        b2.displayBookDetails();
    }
}

