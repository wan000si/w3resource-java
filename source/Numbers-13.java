import java.util.Arrays;
import java.util.Scanner;

public class Numbers_13 {
    public static boolean isPronic(long num) {
        int sqrt_num = (int) Math.sqrt(num);
//        int sqrt_num = Math.floor(Math.sqrt(num));
        return sqrt_num * (sqrt_num + 1) == num;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        long num = input.nextLong();
        String result = isPronic(num) ? "Pronic Number" : "Not a pronic number";
        System.out.println(result);
    }
}
