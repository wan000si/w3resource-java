import java.time.LocalDate;

public class DateTime_22 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("10 days before today:" + today.minusDays(10));
        System.out.println("10 days after today:" + today.plusDays(10));
    }
}
