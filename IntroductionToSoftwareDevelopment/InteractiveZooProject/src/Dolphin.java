public class Dolphin extends Animal {

    private String colorOfDolphin;
    private int swimmingSpeed;

    public Dolphin() {
        super();
        setNameOfAnimal("Dolphin");
        colorOfDolphin = "Unknown";
        swimmingSpeed = 0;
    }

    public Dolphin(String nameOfAnimal, String colorOfDolphin, int swimmingSpeed) {
        super(nameOfAnimal);
        this.colorOfDolphin = colorOfDolphin;
        this.swimmingSpeed = swimmingSpeed;
    }

    public String getColorOfDolphin() {
        return colorOfDolphin;
    }

    public void setColorOfDolphin(String colorOfDolphin) {
        this.colorOfDolphin = colorOfDolphin;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("The dolphin " + getNameOfAnimal() + ": I'm eating delicious fish.");
    }

    public void eatingCompleted() {
        System.out.println(" The dolphin " + getNameOfAnimal() + ": I have eaten fish.");
    }

    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed " + swimmingSpeed + " nautical mph");
    }

}
