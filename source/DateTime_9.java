import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime_9 {
    private Calendar calendar;

    public DateTime_9() {
        this.calendar = Calendar.getInstance();
    }

    public  void getFirstAndLastDayOfWeek() {
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println("The first day of the week:" + dateFormat.format(calendar.getTime()));
        calendar.add(Calendar.DATE, 6);
        System.out.println("The last day of the week:" + calendar.getTime());
    }

    public void enter() {
        getFirstAndLastDayOfWeek();
    }
    public static void main(String[] args) {
        new DateTime_9().enter();
    }
}
