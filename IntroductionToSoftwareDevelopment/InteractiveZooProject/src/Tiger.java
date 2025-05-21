public class Tiger extends Animal implements Walk{

    private int numberOfStripes;
    private int speed;
    private int soundLevelOfRoar;

    public Tiger() {
        super();
        setNameOfAnimal("Tiger");
        numberOfStripes = 0;
        speed = 0;
        soundLevelOfRoar = 0;
    }

    public Tiger(String nameOfAnimal, int numberOfStripes, int speed, int soundLevelOfRoar) {
        super(nameOfAnimal);
        this.numberOfStripes = numberOfStripes;
        this.speed = speed;
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    public void eatingCompleted() {
        System.out.println(" The tiger " + getNameOfAnimal() + ": I have eaten meat.");
    }

    public void walking() {
        System.out.println("I am walking at the speed " + speed + " mph");
    }

} 
