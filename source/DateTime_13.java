import java.util.Calendar;

public class DateTime_13 {
    private Calendar calendar;

    public DateTime_13() {
        this.calendar = Calendar.getInstance();
    }

    public  void getSpecificDay() {
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }

    public void enter() {
        getSpecificDay();
    }
    public static void main(String[] args) {
        new DateTime_13().enter();
    }

}
