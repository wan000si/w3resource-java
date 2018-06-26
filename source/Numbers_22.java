import java.util.Scanner;

public class Numbers_22 {
    public static boolean isMersenne(long num) {
        if (isPrime(num)) {
           for (int i = 0; ; ++i) {
                if (Math.pow(2, i) - 1 == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        } else if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        long num = input.nextLong();
        String result = isMersenne(num) ? " is a Mersenne number" : " is not a Mersenne number";
        System.out.println(num + result);
    }
}
