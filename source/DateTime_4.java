import java.util.Calendar;

public class DateTime_4 {
    private Calendar calendar;

    public DateTime_4() {
        this.calendar = Calendar.getInstance();
    }

    private void getMinimumValues() {
        System.out.println("Minimum Year:" + calendar.getActualMinimum(Calendar.YEAR));
        System.out.println("Minimum Month:" + calendar.getActualMinimum(Calendar.MONTH));
        System.out.println("Minimum Week:" + calendar.getActualMinimum(Calendar.WEEK_OF_YEAR));
        System.out.println("Minimum date:" + calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
    }

    public void enter() {
        getMinimumValues();
    }

    public static void main(String[] args) {
        new DateTime_4().enter();
    }
}
