import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateTime_33 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Next Friday: " + today.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        System.out.println("Previous Friday: " + today.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));
    }
}
