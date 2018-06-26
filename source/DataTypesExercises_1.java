import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class DataTypesExercises_1 {

        public static void main(String[] args) {
            // Write your code here
            System.out.print("Input a degree in Fahrenheit:");
            Scanner input = new Scanner(System.in);
            double fahrenheit,celsius;
            fahrenheit= input.nextDouble();
            celsius = (fahrenheit - 32) / 1.8;
            System.out.println(fahrenheit + "degree Fahrenheit is equal to " + celsius + " in Celsius");

    }
}
