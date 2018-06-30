import java.util.Scanner;

public class DataTypesExercises_2 {
    public static void main(String[] args) {
        System.out.print("Input a value for inch:");
        Scanner input = new Scanner(System.in);
        double inch, meter;
        inch = input.nextDouble();
        meter=inch*0.0254;
        System.out.println(inch+" inch is "+meter+" meters");
    }
}
