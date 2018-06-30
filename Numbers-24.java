import java.util.Scanner;

public class Numbers_24 {
    public static boolean isPalindrome(long num) {
        String str = String.valueOf(num);
        return new StringBuffer(str).reverse().equals(str);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        long num = input.nextLong();
        String result = isPalindrome(num) ? "It is a Palindrome number." : "It is not a Palindrome number.";
        System.out.println(result);
    }
}
