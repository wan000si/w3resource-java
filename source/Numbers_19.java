import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers_19 {
    public static boolean isCyclic(long num) {
        for (int i = 0; i < String.valueOf(num).length(); ++i) {
            if (getRotate(num, i) % num != 0) {
                return false;
            }
        }
        return true;
    }
    private static int getRotate(long num,int distance) {
        String str = String.valueOf(num);
        List<String> numList= Arrays.stream(str.split("")).collect(Collectors.toList());
        Collections.rotate(numList, distance);
        return Integer.parseInt(numList.stream().reduce("", String::concat));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        long num = input.nextLong();
        String result = isCyclic(num) ? "It is a cyclic number." : "It is not a cyclic number.";
        System.out.println(result);
    }

}
