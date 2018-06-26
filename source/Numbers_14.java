import java.util.Scanner;

public class Numbers_14 {
    public static boolean isAutomorphic(long num) {
        long sqr_num = (long) Math.pow(num, 2);
        String str = String.valueOf(num);
        return String.valueOf(sqr_num).endsWith(str);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        long num = input.nextLong();
        String result = isAutomorphic(num) ? "Automorphic Number" : "Not an automorphic number";
        System.out.println(result);
    }
}
