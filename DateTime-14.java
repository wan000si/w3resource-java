import java.time.LocalTime;
import java.util.Calendar;
import java.util.Locale;

public class DateTime_14 {
    private LocalTime localTime;

    public DateTime_14() {
        this.localTime = LocalTime.now();
    }

    public  void getCurrentLocalTime() {
        System.out.println(localTime);
    }

    public void enter() {
        getCurrentLocalTime();
    }
    public static void main(String[] args) {
        new DateTime_14().enter();
    }

}
