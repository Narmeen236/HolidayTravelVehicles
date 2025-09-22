import java.util.Date;

public class Invoice {
    private String invoiceID;
    private Date invoiceDate;
    private double finalPrice;
    private double tax;
    private double licenseFee;
    

    public Invoice(String invoiceID, Date invoiceDate, double finalPrice, double tax, double licenseFee) {
        this.invoiceID = invoiceID;
        this.invoiceDate = invoiceDate;
        this.finalPrice = finalPrice;
        this.tax = tax;
        this.licenseFee = licenseFee;
    }

    public void displayInfo() {
        System.out.println("=== Invoice Information ===");
        System.out.println("Invoice ID: " + invoiceID);
        System.out.println("Date: " + invoiceDate);
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("Tax: $" + tax);
        System.out.println("License Fee: $" + licenseFee);
    }
}