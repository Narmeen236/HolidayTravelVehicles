public class Vehicle {
    private String serialNumber;
    private String name;
    private int year;
    private String manufacturer;
    private String model;
    private double baseCost;

    public Vehicle(String serialNumber, String name, int year, String manufacturer, String model, double baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.year = year;
        this.manufacturer = manufacturer;
        this.model = model;
        this.baseCost = baseCost;
    }

    public void displayInfo() {
        System.out.println("=== Vehicle Information ===");
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Base Cost: $" + baseCost);
    }
}