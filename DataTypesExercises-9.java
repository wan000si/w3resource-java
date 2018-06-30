import java.util.Scanner;

public class DataTypesExercises_9 {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    public static long product(int a, int b) {
        return a * b;
    }

    public static double averge(int a, int b) {
        return (a + b)/2;
    }

    public static int distance(int a, int b) {
        return Math.abs(a-b);
    }

    public static int max(int a, int b) {
        return Math.max(a,b);
    }

    public static int min(int a, int b) {
        return Math.min(a,b);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int input1 = input.nextInt();

        System.out.print("Input 2nd integer: ");
        int input2 = input.nextInt();

        System.out.println("Sum of two integers:" + sum(input1, input2));
        System.out.println("Difference of two integers:" + difference(input1, input2));
        System.out.println("Product of two integers:" + product(input1, input2));
        System.out.println("Average of two integers: " + averge(input1, input2));
        System.out.println("Distance of two integers:" + distance(input1, input2));
        System.out.println("Max integer: " + max(input1, input2));
        System.out.println("Min integer: " + min(input1, input2));
    }
}
