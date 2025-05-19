// BMICalculator class is a utility class that's used to calculate the BMI value in both Imperial and Metric systems
public class BMICalculator {

    // Please declare 4 attributes/properties to represent weight in pounds, height in inches, weight in kilos and height in meters
    double weightInPounds;
    double heightInInches;
    double weightInKilos;
    double heightInMeters;


    // Please use this default no arguments constructor to initialize the 4 properties to some initial values
    public BMICalculator() {

        // Initialize the properties to some default values
        this.weightInPounds = 0;
        this.heightInInches = 0;
        this.weightInKilos = 0;
        this.heightInMeters = 0;

    }

    // Please implement the calculateBmiImperial() method to take in weight and height to calculate and return the BMI value in the Imperial system
    public double calculateBmiImperial(double weight, double height) {
        // Formula to calculate BMI in Imperial system
        return (weight / (height * height)) * 703;

    }

    // Please implement the calculateBmiMetric() method to take in weight and height to calculate and return the BMI value in the Metric system
    public double calculateBmiMetric(double weight, double height) {
        // Formula to calculate BMI in Metric system
        return weight / (height * height);

    }

    // Please implement the getBMICategory() method so that it takes the BMI value and returns the BMI category based on it
    public String getBMICategory(double bmi) {

        String bmiCategory = "";

        // If the BMI is less than 18.5, set the category to "Underweight"
        if (bmi < 18.5) {
            bmiCategory = "Underweight";
        }else if (bmi >= 18.5 && bmi < 25) {
            // If the BMI is between 18.5 and 24.9, set the category to "Normal weight"
            bmiCategory = "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            // If the BMI is between 25 and 29.9, set the category to "Overweight"
            bmiCategory = "Overweight";
        } else if (bmi >= 30) {
            // If the BMI is 30 or above, set the category to "Obesity"
            bmiCategory = "Obese";
        }

        return bmiCategory;

    }
}
