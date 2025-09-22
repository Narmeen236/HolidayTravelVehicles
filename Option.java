public class Option {
    private String optionCode;
    private String description;
    private double price;

    public Option(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("=== Option Information ===");
        System.out.println("Option Code: " + optionCode);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
    }
}