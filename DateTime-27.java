import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime_27 {
    public static void main(String[] args) {
        System.out.println("Input the time(hh::mm::ss): ");
        Scanner inputTime = new Scanner(System.in);
        LocalTime localTime = LocalTime.parse(inputTime.next(), DateTimeFormatter.ofPattern("HH::mm::ss"));
        System.out.println("Current Local time: " + localTime);
        System.out.println("Hour: " + localTime.getHour());
        System.out.println("Minue: " + localTime.getMinute());
        System.out.println("Second: " +localTime.getSecond());
    }
}
