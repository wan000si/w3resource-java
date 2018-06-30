import java.util.Calendar;
import java.util.TimeZone;

public class DateTime_5 {
    private Calendar calendar;

    public DateTime_5() {
        this.calendar = Calendar.getInstance();
    }

    public String getTimeInNewYork() {
        calendar.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        return ("Time In New York:" + calendar.get(Calendar.HOUR_OF_DAY)
                + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
    }

    public void enter() {
        getTimeInNewYork();
    }
    public static void main(String[] args) {
        new DateTime_5().enter();
    }


}
