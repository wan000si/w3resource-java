import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

public class DateTime_21 {
    public static void main(String[] args) {
        ZoneId.SHORT_IDS.keySet().stream()
                .forEach(key -> System.out.println(ZoneId.of(ZoneId.SHORT_IDS.get(key)) + ": "
                + LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get(key)))));
    }
}
