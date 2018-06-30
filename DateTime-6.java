import java.util.Calendar;

public class DateTime_6 {
    private Calendar calendar;

    public DateTime_6() {
        this.calendar = Calendar.getInstance();
    }

    public String getCurrentFullTimeAndDate() {
        return "Current Full date and time is" + (calendar.get(Calendar.MONTH) + 1) + "-"
                + calendar.get(Calendar.DATE) + "-" + calendar.get(Calendar.YEAR) + " "
                + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":"
                + calendar.get(Calendar.SECOND) + "." + calendar.get(Calendar.MILLISECOND);
    }
    public void enter() {
        System.out.println(getCurrentFullTimeAndDate());
    }

    public static void main(String[] args) {
        new DateTime_6().enter();
    }
}
