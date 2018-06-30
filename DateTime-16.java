import java.time.LocalTime;

public class DateTime_16 {

    private LocalTime localTime;
    private static final int hoursOfTwoweek = 2*7*24;

    public DateTime_16() {
        this.localTime = LocalTime.now();
    }

    public  void addHourToCurrentLocalTime() {
        System.out.println("Time after 2 weeks:" + localTime.plusHours(hoursOfTwoweek));
    }

    public void enter() {
        addHourToCurrentLocalTime();
    }
    public static void main(String[] args) {
        new DateTime_16().enter();
    }
}
