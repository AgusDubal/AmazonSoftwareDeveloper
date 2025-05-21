import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1  ;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;



        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:

                    do {

                        System.out.println("The animal which is chosen is : " + tigerObject.getNameOfAnimal());

                        menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);

                        switch (menuChoice) {
                            case 1:

                                System.out.println("Enter the number of stripes:");
                                tigerObject.setNumberOfStripes(keyboard.nextInt());

                                System.out.println("Enter the speed:");
                                tigerObject.setSpeed(keyboard.nextInt());

                                System.out.println("Enter the sound level of roar:");
                                tigerObject.setSoundLevelOfRoar(keyboard.nextInt());

                                System.out.println("Enter the weight:");
                                tigerObject.setWeight(keyboard.nextInt());

                                System.out.println("Enter the height:");
                                tigerObject.setHeight(keyboard.nextInt());

                                System.out.println("Enter the age:");
                                tigerObject.setAge(keyboard.nextInt());

                                System.out.println("The tiger " + tigerObject.getNameOfAnimal() + " has been set with the properties:");

                                break;

                            case 2:

                                System.out.println("The tiger " + tigerObject.getNameOfAnimal() + " has the properties:");
                                System.out.println("Number of stripes: " + tigerObject.getNumberOfStripes());
                                System.out.println("Speed: " + tigerObject.getSpeed());
                                System.out.println("Sound level of roar: " + tigerObject.getSoundLevelOfRoar());
                                System.out.println("Weight: " + tigerObject.getWeight());
                                System.out.println("Height: " + tigerObject.getHeight());
                                System.out.println("Age: " + tigerObject.getAge());

                                break;
                            case 3:

                                System.out.println("The tiger " + tigerObject.getNameOfAnimal() + " is walking:");
                                tigerObject.walking();

                                break;
                            case 4:

                                tigerObject.eatingFood();
                                tigerObject.eatingCompleted();

                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                case 2:

                    do {

                        System.out.println("The animal which is chosen is : " + dolphinObject.getNameOfAnimal());

                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);

                        switch (menuChoice) {
                            case 1:

                                System.out.println("Enter the color of dolphin:");
                                dolphinObject.setColorOfDolphin(keyboard.next());

                                System.out.println("Enter the swimming speed:");
                                dolphinObject.setSwimmingSpeed(keyboard.nextInt());

                                System.out.println("Enter the weight:");
                                dolphinObject.setWeight(keyboard.nextInt());

                                System.out.println("Enter the height:");
                                dolphinObject.setHeight(keyboard.nextInt());

                                System.out.println("Enter the age:");
                                dolphinObject.setAge(keyboard.nextInt());

                                System.out.println("The dolphin " + dolphinObject.getNameOfAnimal() + " has been set with the properties:");

                                break;

                            case 2:

                                System.out.println("The dolphin " + dolphinObject.getNameOfAnimal() + " has the properties:");
                                System.out.println("Color of dolphin: " + dolphinObject.getColorOfDolphin());
                                System.out.println("Swimming speed: " + dolphinObject.getSwimmingSpeed());
                                System.out.println("Weight: " + dolphinObject.getWeight());
                                System.out.println("Height: " + dolphinObject.getHeight());
                                System.out.println("Age: " + dolphinObject.getAge());

                                break;
                            case 3:

                                System.out.println("The dolphin " + dolphinObject.getNameOfAnimal() + " is swimming:");
                                dolphinObject.swimming();

                                break;
                            case 4:

                                dolphinObject.eatingFood();
                                dolphinObject.eatingCompleted();

                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;

                case 3:

                    do {

                        System.out.println("The animal which is chosen is : " + penguinObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);

                        switch (menuChoice) {
                            case 1:

                                System.out.println("Is the penguin swiming? (true/false):");
                                penguinObject.setIsSwimming(keyboard.nextBoolean());

                                System.out.println("Enter the swimming speed:");
                                penguinObject.setSwimSpeed(keyboard.nextInt());

                                System.out.println("Enter the walk speed:");
                                penguinObject.setWalkSpeed(keyboard.nextInt());

                                System.out.println("Enter the weight:");
                                penguinObject.setWeight(keyboard.nextInt());

                                System.out.println("Enter the height:");
                                penguinObject.setHeight(keyboard.nextInt());

                                System.out.println("Enter the age:");
                                penguinObject.setAge(keyboard.nextInt());

                                System.out.println("The penguin " + penguinObject.getNameOfAnimal() + " has been set with the properties:");

                                break;

                            case 2:

                                System.out.println("The penguin " + penguinObject.getNameOfAnimal() + " has the properties:");
                                System.out.println("Swimming speed: " + penguinObject.getSwimSpeed());
                                System.out.println("Walk speed: " + penguinObject.getWalkSpeed());
                                System.out.println("Weight: " + penguinObject.getWeight());
                                System.out.println("Height: " + penguinObject.getHeight());
                                System.out.println("Age: " + penguinObject.getAge());

                                break;
                            case 3:

                                if(penguinObject.getIsSwimming()) {
                                    System.out.println("The penguin " + penguinObject.getNameOfAnimal() + " is swimming:");
                                    penguinObject.swimming();
                                } else {
                                    System.out.println("The penguin " + penguinObject.getNameOfAnimal() + " is walking:");
                                    penguinObject.walking();
                                }

                                break;
                            case 4:

                                penguinObject.eatingFood();
                                penguinObject.eatingCompleted();

                                break;
                            default:
                                System.out.println("Not supported");

                            }
                            System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                            continueInnerLoop = keyboard.nextInt();
                        }while (continueInnerLoop == 1);

                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);


    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.println("Enter choice of animal (1-3):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}



