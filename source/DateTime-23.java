import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTime_23 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        Period period = Period.between(today, lastDayOfYear);
        System.out.println("Month remaining in the year:" + period.getMonths());
    }
}
