import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;

public class DateTime_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two dates(YY-MM-DD HH:MM:SS): ");
        LocalDateTime date1 = LocalDateTime.parse(input.next());
        LocalDateTime date2 = LocalDateTime.parse(input.next());
        Duration period = Duration.between(date1, date2);
        System.out.println("Difference between the two dates is "
                + period.toHours() + "hours, "
                + period.toMinutes() + "minites, "
                + period.toMillis() + "milli, "
                + period.getSeconds() + "seconds, "
                + period.toNanos() + "nano");
    }
}
