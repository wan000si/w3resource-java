import java.util.Arrays;
import java.util.Scanner;

public class Numbers_15 {
    public static boolean isDuck(long num) {
        String str = String.valueOf(num);
        return str.indexOf("0") > 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        long num = input.nextLong();
        String result = isDuck(num) ? "Duck Number" : "Not a duck number";
        System.out.println(result);
    }
}
