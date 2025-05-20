// Inherit from Coffee using the extends keyword
public class Espresso extends Coffee {

    // Declare an attribute to store the number of shots (int)
    int numberOfShots;

    // Constructor to initialize all attributes
    public Espresso(String name, String roast, double price, int numberOfShots) {
        // Use super to call the Coffee constructor
        super(name, roast, price);

        // Initialize numberOfShots using this
        this.numberOfShots = numberOfShots;
    }

    @Override
    public void grindBeans() {
        
        super.grindBeans();
        System.out.println("\nThe espresso beans are ground to a fine powder.");
        
    }
    
    @Override
    public void brewCoffee() {
        
        super.brewCoffee();
        System.out.println("\nThe espresso is brewed with high pressure.");

    }

    
    @Override
    public void printInfo() {
        
        super.printInfo();

        
        System.out.println("You asked for " + numberOfShots + " servings!");
        System.out.println("Every serving of Espresso costs " + price + "$. Your total bill is " + (price * numberOfShots) + "$.");

    }

}
