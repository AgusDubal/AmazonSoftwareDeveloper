public class SmartCamera extends Camera {

    @Override
    public void takePicture() {
        super.takePicture();
        System.out.println("Applying AI to enhance the picture");
    }

}
