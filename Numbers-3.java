import java.util.Scanner;

import static java.lang.Math.random;

public class Numbers_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input the starting number of the range: ");
        int startNum = input.nextInt();

        System.out.println("Input the ending number of the range: ");
        int endNum = input.nextInt();

        int randomNum = (int) (startNum + random() * ((endNum - startNum) + 1));

        System.out.println(randomNum);
    }
}
