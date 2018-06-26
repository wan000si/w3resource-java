import java.util.Scanner;

public class Numbers_18 {
    public static boolean isCube(long num) {
        long cube_num = (int) Math.round(Math.pow(num, 1.0 / 3.0));
        if (num == cube_num * cube_num * cube_num) {
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        long num = input.nextLong();
        String result = isCube(num) ? "Number is a cube." : "Number is not a cube.";
        System.out.println(result);
    }
}
