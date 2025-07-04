public class Coffee {

    // Attributes to store information about the coffee
    String name;                // for example, "Espresso", "Latte", "Mocha"
    String roast;               // for example, "light", "medium", "dark"
    int caffeineLevelInMg;      // calculated based on the roast
    double price;               // in dollars, for example, 2.50

    // Constructor to create a new coffee object with the given information
    public Coffee(String name, String roast, double price) {
        this.name = name;
        this.roast = roast;
        this.price = price;

        // The constructor calls the method to set the caffeine level based on the roast
        setCaffeineLevel();
    }

    // Method to set the caffeine level of the coffee based on the roast
    public void setCaffeineLevel() {
        switch (roast.toLowerCase()) {
            case "light":
                caffeineLevelInMg = 50; // light roast has more caffeine
                break;
            case "medium":
                caffeineLevelInMg = 100; // medium roast has moderate caffeine
                break;
            case "dark":
                caffeineLevelInMg = 150; // dark roast has less caffeine
                break;
            default:
                System.out.println("Invalid roast type. Setting caffeine level to 0 mg.");
                caffeineLevelInMg = 0; // default value for invalid roast
                break;
        }
    }

    // Methods to simulate coffee preparation
    public void grindBeans() {
        System.out.println("\nGrinding beans for " + name + "...");
    }

    public void brewCoffee() {
        System.out.println("\nBrewing your favorite " + name + "...");
    }

    // Method to print the information about the coffee
    public void printInfo() {
        System.out.println("\nYou ordered a " + name + " with a " + roast + " roast.");
        System.out.println("The caffeine level in your coffee is " + caffeineLevelInMg + " mg.");
    }
}
