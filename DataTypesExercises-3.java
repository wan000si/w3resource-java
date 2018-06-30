import java.util.Scanner;

public class DataTypesExercises_3 {
    public static void main(String[] args) {
        System.out.print("Input an integer between 0 and 1000:");
        Scanner input = new Scanner(System.in);
        Integer num = Integer.valueOf(input.nextInt());
        Integer sum = 0;
        while (num / 10 != 0) {
            sum += num % 10;
            num = num / 10;
        }
        sum += sum;
        System.out.println("The sum of all digits in " + num + " is " + sum);
    }
}
