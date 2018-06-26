import java.util.Calendar;

public class DateTime_11 {
    private Calendar calendar;

    public DateTime_11() {
        this.calendar = Calendar.getInstance();
    }

    public  void getDatesOfTheMonth() {
        System.out.println(calendar.getMaximum(Calendar.DAY_OF_MONTH));
    }

    public void enter() {
        getDatesOfTheMonth();
    }
    public static void main(String[] args) {
        new DateTime_11().enter();
    }

}
