import java.util.Scanner;

public class Numbers_16 {
    public static boolean isAmicable(long num1, long num2) {
        if (num1 == num2) {
            return false;
        }
        return getSumOfDivisors(num1) == getSumOfDivisors(num2);
    }

    public static long getSumOfDivisors(long num) {
        long sum = 0;
        for (int i = 1; i <= num; ++i) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        long num1 = input.nextLong();
        System.out.print("Input the second number: ");
        long num2 = input.nextLong();
        String result = isAmicable(num1,num2) ? "These numbers are amicable." : "These numbers are not amicable.";
        System.out.println(result);
    }
}
