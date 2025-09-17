package JavaClassObjectPracticeLevel2;

public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }

    // Book ticket
    public void bookTicket(String seatNumber, double price) {
        if (isBooked) {
            System.out.println(" Ticket already booked!");
        } else {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println(" Ticket booked successfully!");
        }
    }

    // Display ticket
    public void displayTicket() {
        if (isBooked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Dragon");

        ticket.displayTicket();
        ticket.bookTicket("A10", 120.0);
        ticket.bookTicket("B10", 120.0); // Trying again
        ticket.displayTicket();
    }
}

