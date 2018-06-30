import java.util.Scanner;

public class DataTypesExercises_8 {
    public static void main(String[] args) {
        System.out.print("Input a value:");
        Scanner input = new Scanner(System.in);
        double val = input.nextDouble();

        System.out.printf("Square:%.2f", Math.pow(val, 2));
        System.out.printf("Cube:%.2f", Math.pow(val, 3));
        System.out.printf("Fourth power:%.2f", Math.pow(val, 4));
    }
}
