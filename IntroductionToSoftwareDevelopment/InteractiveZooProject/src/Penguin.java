public class Penguin extends Animal implements Walk, Swim{

    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    public Penguin() {
        super();
        setNameOfAnimal("Penguin");
        isSwimming = false;
        walkSpeed = 0;
        swimSpeed = 0;
    }

    public boolean getIsSwimming() {
        return isSwimming;
    }

    public void setIsSwimming(boolean isSwimming) {
        this.isSwimming = isSwimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("The penguin " + getNameOfAnimal() + ": I'm eating delicious fish.");
    }

    public void eatingCompleted() {
        System.out.println(" The penguin " + getNameOfAnimal() + ": I have eaten fish.");
    }

    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed + " mph");
    }

    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + swimSpeed + " nautical mph");
    }

}
