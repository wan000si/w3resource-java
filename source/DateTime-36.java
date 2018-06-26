import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class DateTime_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a unix timestamp: ");
        long unix_seconds = input.nextLong();
        Date date = new Date(unix_seconds * 1000L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT-4"));
        System.out.println(simpleDateFormat.format(date));
    }
}
