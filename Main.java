import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Customers
        Customer c1 = new Customer("C001", "Alice Brown", "123 Main St", "0891234567");
        Customer c2 = new Customer("C002", "David Lee", "45 Oak Road", "0819876543");

        // Salesperson
        Salesperson s1 = new Salesperson("S001", "John Smith", "0812345678");

        // Vehicle
        Vehicle v1 = new Vehicle("V001", "Camper", 2025, "Holiday Motors", "ModelX", 45000.00);

        // Trade-in Vehicle
        TradeInVehicle t1 = new TradeInVehicle("T001", "Toyota", "Corolla", 2018);

        // Options
        Option o1 = new Option("O001", "Air Conditioning", 1200.00);
        Option o2 = new Option("O002", "GPS Navigation", 800.00);

        // Invoice 1 (Alice + turn the car + 2 options)
        Invoice i1 = new Invoice("I001", new Date(), 48000.00, 3000.00, 500.00,
                c1, s1, v1, t1);
        i1.addOption(o1);
        i1.addOption(o2);

        // Invoice 2 (David no turn the car + 1 option)
        Invoice i2 = new Invoice("I002", new Date(), 52000.00, 3500.00, 600.00,
                c2, s1, v1, null);
        i2.addOption(o2);

        // Show invoices
        i1.displayInfo();
        System.out.println("\n-----------------------------\n");
        i2.displayInfo();
    }
}