public class Main {
    public static void main(String[] args) {

        SideKick sideKickObject = new SideKick();


        /**System.out.println("Mode of operation is: " + sideKickObject.modeOfOperation);**/

        System.out.println("Mode of operation is: " + sideKickObject.getModeOfOperation());

        sideKickObject.setModeOfOperation(3);

        sideKickObject.takeAction();
        

        sideKickObject.setModeOfOperation(1);
        sideKickObject.takeAction(); 


        sideKickObject.setModeOfOperation(2);
        sideKickObject.takeAction();
        
    }
}