import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

public class DateTime_12 {
    private Calendar calendar;

    public DateTime_12() {
        this.calendar = Calendar.getInstance();
    }

    public  void getLocalWeekName(){
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(new Locale("de"));
        String[] weekName = dateFormatSymbols.getWeekdays();
        Arrays.stream(weekName).forEach(item -> System.out.println(item));
        System.out.println(calendar.getTime());
    }

    public void enter() {
        getLocalWeekName();
    }
    public static void main(String[] args) {
        new DateTime_12().enter();
    }

}
