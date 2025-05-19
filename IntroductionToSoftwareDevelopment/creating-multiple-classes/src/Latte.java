public class Latte extends Coffee {
    // Attribute to store the type of milk
    String milkType;
    String syrupFlavor;

    // Constructor to create a new Latte object with the given information
    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) {
        super(name, roast, price); // Call the constructor of the parent class (Coffee)
        this.milkType = milkType; // Set the type of milk
        this.syrupFlavor = syrupFlavor; // Set the syrup flavor
    }

    // Method to print details specific to Latte
    public void printLatteDetails() {
        System.out.println("You ordered a " + name + " with " + milkType + " milk and " + syrupFlavor + " syrup.");
        System.out.println("The price is: $" + price);
    }

}
