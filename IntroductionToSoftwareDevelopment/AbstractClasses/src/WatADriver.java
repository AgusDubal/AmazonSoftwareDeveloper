import java.util.Scanner;

public class WatADriver extends Robot {

    Scanner keyboard = new Scanner(System.in);

    @Override
    public void setChoice() {
        System.out.println("***** WatADriver Menu *****");
        System.out.println("1. Drive");
        System.out.println("2. Fly");
        System.out.println("3. Re-charge");

        System.out.println("Enter choice(1-3):");
        int choice = keyboard.nextInt();

        setModeOfOperation(choice);
    }

    @Override
    public void takeAction() {
        
        switch (getModeOfOperation()) {
            case 1:
                System.out.println("WatADriver will drive here");
                break;
            case 2:
                System.out.println("WatADriver will fly here");
                break;
            case 3:
                rechargeBattery();
                System.out.println("WatADriver recharged battery.");
                break;
            default:
                System.out.println("WatADriver does not support the operation.");
        }

    }




}

