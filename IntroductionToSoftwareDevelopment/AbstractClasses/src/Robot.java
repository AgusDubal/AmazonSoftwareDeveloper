public abstract class Robot {

    /** mode of operation  **/
    private int modeOfOperation;

    /** charge of battery  **/
    private int batteryCharge;

    public Robot() {
        // initial charge of battery is 0
        batteryCharge = 0 ;
        // set default to cleaning or 1
        modeOfOperation = 1;
    }
    
     // accessor/getter method  for modeOfOperation
    public int getModeOfOperation() {
        return modeOfOperation;
    }

    // mutator/setter method for modeOfOperation
    public void setModeOfOperation(int modeOfOperation) {
        if(modeOfOperation>=1 && modeOfOperation<=3) {
            this.modeOfOperation = modeOfOperation;
        } else {
            this.modeOfOperation = 1;
        }
    }

    /* Getter method */
    public int getBatteryCharge() {
        return batteryCharge;
    }

    /* Setter method */
    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    /* method to recharge battery */
    public void rechargeBattery() {
        System.out.println("Plug into socket.....");
        System.out.print("Charging ..");
        for (int i = 0; i <= 100; i += 10) {
            System.out.print(".");
            batteryCharge = i;

        }
        System.out.println("\nUnplug from socket.....");
        System.out.println("Fully charged.....");

    }

    /* method to display the battery */
    public void displayBatteryLevel() {
        System.out.println("The battery charge is at :" + batteryCharge + " %.");
    }

    public abstract void setChoice();
    
    public abstract void takeAction();


}


