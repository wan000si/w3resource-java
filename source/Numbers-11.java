import java.util.Arrays;
import java.util.Scanner;

public class Numbers_11 {
    public static boolean isDisarium(long num) {
        String str = String.valueOf(num);
        return num == Arrays.stream(str.split(""))
                .map(item -> Math.pow(Integer.parseInt(item), str.indexOf(item) + 1))
                .reduce((x, y) -> x + y).get();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        long num = input.nextLong();
        String result = isDisarium(num) ? "Disarium Number" : "Not a disarium number";
        System.out.println(result);
    }
}
