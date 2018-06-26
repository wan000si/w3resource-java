import java.util.Calendar;

public class DateTime_2 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Year:" + c.get(Calendar.YEAR));
        System.out.println("Month:" + c.get(Calendar.MONTH));
        System.out.println("Day:" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour:" + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute:" + c.get(Calendar.MINUTE));
    }
}
