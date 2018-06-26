import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime_34 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        System.out.println("Today's date at midnight time: " + calendar.getTime());
    }
}
