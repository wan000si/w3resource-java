import java.util.Scanner;

public class Numbers_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer number: ");
        int i = input.nextInt();
        if (i <= 0) {
            System.out.println("Number should not be negetive.");
        }
        boolean flag = true;
         while (i != 1) {
             if (i % 5 == 0) {
                 i /= 5;
             } else if (i % 3 == 0) {
                 i /= 3;
             } else if (i % 2 == 0) {
                 i /= 2;
             } else {
                 flag = false;
                 System.out.println("It is not an ugly number.");
                 break;
             }
         }
        if (flag) {
            System.out.println("It is an ugly number.");
        }
    }
}
