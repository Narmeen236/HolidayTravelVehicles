public class Customer {
    private String customerID;
    private String name;
    private String address;
    private String phone;

    public Customer(String customerID, String name, String address, String phone) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getFullName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("=== Customer Information ===");
        System.out.println("Customer ID: " + customerID);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }
}