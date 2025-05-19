public class Espresso extends Coffee {
    // Attribute to store the number of shots
    int numberOfShots;

    // Constructor to create a new Espresso object with the given information
    public Espresso(String name, String roast, double price, int numberOfShots) {
        super(name, roast, price); // Call the constructor of the parent class (Coffee)
        this.numberOfShots = numberOfShots; // Set the number of shots
    }

    // Method to print details specific to Espresso
    public void printEspressoDetails() {
        System.out.println("You ordered " + numberOfShots + " shots of " + name + ".");
        System.out.println("The price per shot is: $" + price);
        System.out.println("The total price is: $" + (price * numberOfShots));
    }

}
