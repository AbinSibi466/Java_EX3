package labEx3;

// Abstract class representing a general ticket
abstract class Ticket {
    private String movieName;
    private String showTime;
    private double price;

    // Constructor
    public Ticket(String movieName, String showTime, double price) {
        this.movieName = movieName;
        this.showTime = showTime;
        this.price = price;
    }

    // Abstract method to calculate the ticket price
    public abstract double calculatePrice();

    // Getters and setters
    public String getMovieName() {
        return movieName;
    }

    public String getShowTime() {
        return showTime;
    }

    public double getPrice() {
        return price;
    }
}

// Concrete class representing a standard ticket
class StandardTicket extends Ticket {
    // Constructor
    public StandardTicket(String movieName, String showTime, double price) {
        super(movieName, showTime, price);
    }

    // Implementing the abstract method to calculate the ticket price
    @Override
    public double calculatePrice() {
        // Standard ticket price calculation logic
        return getPrice();
    }
}

// Concrete class representing a VIP ticket
final class VIPTicket extends Ticket {
    private String specialService;

    // Constructor
    public VIPTicket(String movieName, String showTime, double price, String specialService) {
        super(movieName, showTime, price);
        this.specialService = specialService;
    }

    // Implementing the abstract method to calculate the ticket price
    @Override
    public double calculatePrice() {
        // VIP ticket price calculation logic, considering special services
        return getPrice() * 1.5;
    }

    // Getter for special service
    public String getSpecialService() {
        return specialService;
    }
}

// Example of using the MovieTicketBooking application
public class MovieTicketBookingApp {
    public static void main(String[] args) {
        // Creating a standard ticket
        StandardTicket standardTicket = new StandardTicket("Movie 1", "8:00 PM", 10.0);
        System.out.println("Standard Ticket - Price: $" + standardTicket.calculatePrice());

        // Creating a VIP ticket
        VIPTicket vipTicket = new VIPTicket("Movie 2", "9:30 PM", 15.0, "Exclusive Lounge Access");
        System.out.println("VIP Ticket - Price: $" + vipTicket.calculatePrice() + " - Special Service: " + vipTicket.getSpecialService());
    }
}

