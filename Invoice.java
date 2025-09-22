import java.util.ArrayList;
import java.util.Date;

public class Invoice {
    private String invoiceID;
    private Date invoiceDate;
    private double finalPrice;
    private double tax;
    private double licenseFee;

    // Associations
    private Customer customer;
    private Salesperson salesperson;
    private Vehicle vehicle;
    private TradeInVehicle tradeInVehicle;   
    private ArrayList<Option> options;        

    public Invoice(String invoiceID, Date invoiceDate, double finalPrice, double tax, double licenseFee,
                   Customer customer, Salesperson salesperson, Vehicle vehicle,
                   TradeInVehicle tradeInVehicle) {
        this.invoiceID = invoiceID;
        this.invoiceDate = invoiceDate;
        this.finalPrice = finalPrice;
        this.tax = tax;
        this.licenseFee = licenseFee;
        this.customer = customer;
        this.salesperson = salesperson;
        this.vehicle = vehicle;
        this.tradeInVehicle = tradeInVehicle;
        this.options = new ArrayList<>();
    }

    // add Option
    public void addOption(Option option) {
        options.add(option);
    }

    // delete Option
    public void removeOption(Option option) {
        options.remove(option);
    }

    public void displayInfo() {
        System.out.println("=== Invoice Information ===");
        System.out.println("Invoice ID: " + invoiceID);
        System.out.println("Date: " + invoiceDate);
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("Tax: $" + tax);
        System.out.println("License Fee: $" + licenseFee);

        System.out.println();
        if (customer != null) {
            customer.displayInfo();
        }
        System.out.println();
        if (salesperson != null) {
            salesperson.displayInfo();
        }
        System.out.println();
        if (vehicle != null) {
            vehicle.displayInfo();
        }
        System.out.println();
        if (tradeInVehicle != null) {
            tradeInVehicle.displayInfo();
        }
        if (!options.isEmpty()) {
            for (Option opt : options) {
                System.out.println();
                opt.displayInfo();
            }
        }
    }
}