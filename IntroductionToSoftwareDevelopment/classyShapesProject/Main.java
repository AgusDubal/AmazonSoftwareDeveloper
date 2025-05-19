package Java.classyShapesProject;

public class Main {
    
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        Circle circle = new Circle(2.0);

        double rectangleArea = ShapeMetricCalculator.calculateRectangleArea(rectangle);
        double circleArea = ShapeMetricCalculator.calculateCircleArea(circle);

        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Area of the circle: " + circleArea);

    }

}

