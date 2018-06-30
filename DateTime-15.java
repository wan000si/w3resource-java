import java.time.LocalTime;
import java.util.Calendar;
import java.util.Scanner;

public class DateTime_15 {
    private LocalTime localTime;
    private int addHour;

    public DateTime_15() {
        this.localTime = LocalTime.now();
    }

    public void setAddHour(int addHour) {
        this.addHour = addHour;
    }

    public  void addHourToCurrentLocalTime(int addHour) {
        System.out.println("Time after " + addHour + "hours:" + localTime.plusHours(addHour));
    }

    public void enter() {
        Scanner inputHour = new Scanner(System.in);
        int addHour = inputHour.nextInt();
        addHourToCurrentLocalTime(addHour);
    }
    public static void main(String[] args) {
        new DateTime_15().enter();
    }

}
