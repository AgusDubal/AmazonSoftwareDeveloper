package Java;
import java.util.Scanner;
public class DrivingSimulationLab {

    // Initial position of the gear is P (i.e. Park) so, initializing variable gear with same
    public static String gear = "P";
    // Initial speed is set to 0, initializing variable speed with same
    public static int speed = 0;
    // Engine is initially off so the variable isEngineOn is set to false.
    public static boolean isEngineOn = false;
    // Getting user input via scanner class
    public static Scanner keyBoard = new Scanner(System.in);

    // Starts the car simulation
    public static void startSimulation() {
        // Variable to control the display of the menu
        boolean displayMenu = true;
        // Until the variable displayMenu is true this block will be executed
        while (displayMenu) {
            //  Invoking displayDashboard method to showcase the current state of the car.
            displayDashboard();
            // Get the user choice
            int choice = getUserChoice();
            // Calling processChoice method by passing above integer as a parameter
            processChoice(choice);
            System.out.println();
        }
    }

    // displayDashboard method displays the car dashboard with current state and menu options
    public static void displayDashboard() {
        System.out.println("------ Car Dashboard ------");
        System.out.println("Speed: " + speed);
        // Display the current state of the engine (i.e. on/off)
        System.out.println("Engine: " + (isEngineOn ? "On" : "Off"));
        // Display the gear in which the car is currently in
        System.out.println("Gear: " + gear);
        // Present a Menu which will allow user to choose the specific action
        System.out.println("Menu:");
        System.out.println("1. Turn on/off the engine");
        System.out.println("2. Change gear (P, D, R)");
        System.out.println("3. Accelerate");
        System.out.println("4. Brake");
        System.out.println("5. Exit");
    }

    // getUserChoice function has a return type int which stores the input received from the user
    public static int getUserChoice() {
        // Gets the user's choice from the menu
        System.out.print("Enter your choice (1-5): ");
        // Return the user's choice as an integer
        return keyBoard.nextInt();
    }

    // Processes the user's choice from the menu
    public static void processChoice(int choice) {
        switch (choice) {
            // Toggle the engine state
            case 1:
                toggleEngine();
                break;
            // Change the gear
            case 2:
                changeGear();
                break;
            // Accelerate the car
            case 3:
                accelerate();
                break;
            // Apply the brakes
            case 4:
                brake();
                break;
            // Exit/Terminate the simulation
            case 5:
                exitSimulation();
                break;
            // Handle the invalid choice (Any other input from the user except choices given above)
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

   
    public static void toggleEngine() {
    
        isEngineOn = !isEngineOn;

    }

    
    public static void changeGear() {

        System.out.print("Enter new gear (P, D, R): ");
        gear = keyBoard.next();
        System.out.println("Gear changed to: " + gear);

    }

    
    public static void accelerate() {
    
        if (isEngineOn && !gear.equals("P")) {

            speed += 10;
            System.out.println("Accelerated. Current speed: " + speed);

        } else {

            System.out.println("Cannot accelerate. Engine is off or in Park (P) gear.");

        }
    }

    // Please implement brake() function that applies the brake according to the condition
    public static void brake() {
        // Add condition to apply the brakes if the engine state is on and the speed is greater than 5
        if (isEngineOn && speed > 5) {

            speed -= 5;
            System.out.println("Braked. Current speed: " + speed);

        }else {

            System.out.println("Cannot brake. Engine is off or already at zero speed.");

        }
    }

    // Please implement exitSimulation() function that terminates the simulation
    public static void exitSimulation() {
        
        System.out.println("Exiting the simulation. Goodbye!");
        System.exit(0);

    }

    // Main method to start the simulation
    public static void main(String[] args) {
        // Invoke the startSimulation method
        startSimulation();
    }
}
