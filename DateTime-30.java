import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two dates(YY-MM-DD): ");
        LocalDate date1 = LocalDate.parse(input.next());
        LocalDate date2 = LocalDate.parse(input.next());
        Period period = Period.between(date1, date2);
        System.out.println("Difference between the two dates is "
                + period.getYears() + "years, "
                + period.getMonths() + "months, "
                + period.getDays() + "Days");
    }
}
