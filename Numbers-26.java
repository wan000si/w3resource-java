import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Numbers_26 {
    public static boolean isKeith(long num) {
        String str = String.valueOf(num);
        int sumOfKeith = 0;
        List<Integer> numList = getNumList(num);
        while (sumOfKeith < num) {
            sumOfKeith = numList.stream()
                    .skip(numList.size() - str.length()).limit(str.length())
                    .reduce(0, Integer::sum);
            numList.add(sumOfKeith);
            if (num == sumOfKeith) {
                return true;
            }
        }
        return false;
    }

    public static List<Integer> getNumList(long num) {
        List<Integer> numList = new ArrayList<>();
        Arrays.stream(String.valueOf(num).split(""))
                .mapToInt(Integer::parseInt).forEach(item -> numList.add(item));
        return numList;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        long num = input.nextLong();
        String result = isKeith(num) ? "Keith number" : "Not a Keith number";
        System.out.println(result);
    }
}
