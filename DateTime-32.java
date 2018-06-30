import com.sun.org.apache.xpath.internal.SourceTree;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateTime_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your birthday(YY-MM-DD): ");
        LocalDate birthday = LocalDate.parse(input.next());
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthday, today);
        System.out.println("My age is: "
                + period.getYears() + "years "
                + period.getMonths() + "months "
                + period.getDays() + "days");
    }
}
