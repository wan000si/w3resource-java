import java.util.Arrays;
import java.util.Scanner;

public class Numbers_10 {
    public static boolean isHappyNum(long num) {
        if (num == 1) {
            return true;
        }
        String str = String.valueOf(num);
        return isHappyNum(Arrays.stream(str.split(""))
                .map(item -> Math.pow(Integer.parseInt(item), 2))
                .reduce((x, y) -> x + y).get()
                .longValue());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        long num = input.nextLong();
        String result = isHappyNum(num) ? "Happy Number" : "Unhappy Number";
        System.out.println(result);
    }

}
