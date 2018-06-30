import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateTime_19 {
    public Period getDiffBetweenTwoDates(LocalDate date1, LocalDate date2) {
        return Period.between(date1, date2);
    }

    public void enter() {
        Scanner inputYear = new Scanner(System.in);
        System.out.println("Input the first date:");
        LocalDate date1 = LocalDate.parse(inputYear.next());

        System.out.println("Input the second date:");
        LocalDate date2 = LocalDate.parse(inputYear.next());

        Period diff = getDiffBetweenTwoDates(date1, date2);

        System.out.println("The year between the two dates:" + diff.getYears());
        System.out.println("The month between the two dates:" + diff.getMonths());
    }
    public static void main(String[] args) {
        new DateTime_19().enter();
    }
}
