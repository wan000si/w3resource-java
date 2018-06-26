import java.util.Arrays;
import java.util.Scanner;

public class Numbers_12 {
    public static boolean isHarshad(long num) {
        String str = String.valueOf(num);
        return (num % Arrays.stream(str.split(""))
                .mapToInt(item->Integer.parseInt(item)).sum())==0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        long num = input.nextLong();
        String result = isHarshad(num) ? " is a Harshad Number" : " is not a Harshad Number";
        System.out.println(num + result);
    }
}
