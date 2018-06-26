import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;

public class DateTime_10 {
    private Calendar calendar;

    public DateTime_10() {
        this.calendar = Calendar.getInstance();
    }

    public  void getFirstAndLastDayOfMonth() {
        YearMonth yearMonth = YearMonth.of(2018, 6);
        String firstDay = yearMonth.atDay(1).getDayOfWeek().name();
        String lastDay = yearMonth.atEndOfMonth().getDayOfWeek().name();
        System.out.println("The first day of the month:" + firstDay);
        System.out.println("The last day of the month:" + lastDay);
    }

    public void enter() {
        getFirstAndLastDayOfMonth();
    }
    public static void main(String[] args) {
        new DateTime_10().enter();
    }
}
