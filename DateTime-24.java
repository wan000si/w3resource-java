import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_24 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Default format of LocalDate=" + today);
        System.out.println(today.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Default format of LocalDateTime=" + currentTime);
        System.out.println(currentTime.format((DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"))));

        Instant instant = Instant.now();
        System.out.println("Default format of Instant=" + instant);
        LocalDateTime parseTime = LocalDateTime.parse("27::Apr::2014 21::39::48",
                DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
        System.out.println("Default format after parsing=" + parseTime);
    }
}
