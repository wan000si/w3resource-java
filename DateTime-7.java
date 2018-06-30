import java.util.Calendar;

public class DateTime_7 {
    private Calendar calendar;

    public DateTime_7() {
        this.calendar = Calendar.getInstance();
    }

    public  void getLastDateOfCurrentMonth() {
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    }

    public void enter() {
        getLastDateOfCurrentMonth();
    }
    public static void main(String[] args) {
        new DateTime_7().enter();
    }
}
