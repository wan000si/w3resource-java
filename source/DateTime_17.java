import java.util.Calendar;
import java.util.Date;

public class DateTime_17 {
    private Calendar calendar;

    public DateTime_17() {
        this.calendar = Calendar.getInstance();
    }

    public  void getDateOneYearBeforeAndAfter() {
        calendar.add(Calendar.YEAR, -1);
        Date beforeOneYear = calendar.getTime();
        calendar.add(Calendar.YEAR, 2);
        Date afterOneYear = calendar.getTime();
        System.out.println("Date before 1 year:" + beforeOneYear);
        System.out.println("Date after 1 year:" + afterOneYear);
    }

    public void enter() {
        getDateOneYearBeforeAndAfter();
    }
    public static void main(String[] args) {
        new DateTime_17().enter();
    }
}
