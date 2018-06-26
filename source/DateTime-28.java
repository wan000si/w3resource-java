import java.time.LocalDateTime;
import java.util.Scanner;

public class DateTime_28 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        Scanner input = new Scanner(System.in);
        System.out.println("Input hour: ");
        int hour = input.nextInt();
        System.out.println("Input minute: ");
        int minute = input.nextInt();
        LocalDateTime dateTime = localDateTime.minusHours(hour).minusMinutes(minute);
        System.out.println("Before " + hour + "hours and" + minute + "minutes is " + dateTime);
    }
}
