import java.util.Objects;

// Inherit from Coffee using the extends keyword
public class Latte extends Coffee {
    // Declare two attributes to store the milk type and syrup flavor (String)
    String milkType;
    String syrupFlavor;

    // Constructor to initialize all attributes
    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) {
        // Use super to call the Coffee constructor
        super(name, roast, price);

        // Initialize milkType and syrupFlavor using this
        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }

    
    @Override
    public void grindBeans() {
        
        System.out.println("\nGrinding coffee beans coarsely for a latte (medium grind)...");

    }
    

    @Override
    public void brewCoffee() {
        
        System.out.println("Brewing coffee for a latte...");
        
        if (!syrupFlavor.equals("no)")) {
        
        System.out.println("Adding " + syrupFlavor + " syrup to the cup...");
        }

        System.out.println("Steaming " + milkType + " milk...");

        System.out.println("Combining brewed coffee with steamed " + milkType + " milk...");

        System.out.println("Adding a layer of foam on top...");

    }


    @Override
    public void printInfo() {

        super.printInfo();

        System.out.println("Your latte has " + milkType + " milk and " + syrupFlavor + " flavor.");
        System.out.println("Your total bill is " + price + "$.");

    }

}
