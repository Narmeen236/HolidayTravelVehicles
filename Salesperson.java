public class Salesperson {
    private String salespersonID;
    private String name;
    private String phone;

    public Salesperson(String salespersonID, String name, String phone) {
        this.salespersonID = salespersonID;
        this.name = name;
        this.phone = phone;
    }

    public void displayInfo() {
        System.out.println("=== Salesperson Information ===");
        System.out.println("Salesperson ID: " + salespersonID);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }
}