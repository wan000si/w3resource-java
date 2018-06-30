import java.util.Scanner;

public class DataTypesExercises_4 {
    public static void main(String[] args) {
        System.out.print("Input the number of minutes:");
        Scanner input = new Scanner(System.in);
        long minutes;
        long minuteInOneYear = 365 * 24 * 60,minuteInOneDay=24*60;
        long years,days;
        minutes = input.nextLong();
        years = minutes / minuteInOneYear;
        days =(minutes - years * minuteInOneYear) / minuteInOneDay;
        System.out.println(minutes+" minutes is approximately "+years+" years and "+" days");
    }
}
