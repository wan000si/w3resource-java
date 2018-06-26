import java.util.Calendar;

public class DateTime_8 {
    private Calendar calendar;

    public DateTime_8() {
        this.calendar = Calendar.getInstance();
    }

    public  void getLastDateOfTheMonth() {
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.getTime());
    }

    public void enter() {
        getLastDateOfTheMonth();
    }
    public static void main(String[] args) {
        new DateTime_8().enter();
    }
}
