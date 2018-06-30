import java.util.Scanner;

public class DataTypesExercises_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input weight in pounds:");
        double weightInPounds = input.nextDouble();
        System.out.println();

        System.out.print("Input height in inches:");
        double heightInInches = input.nextDouble();
        System.out.println();

        double weightInKg = weightInPounds *0.4535923;
        double heightInMeter = heightInInches * 0.0254;
        double BMI;
        BMI = weightInKg / Math.pow(heightInMeter, 2);
        System.out.println("Body Mass Index is " + BMI);
    }
}
