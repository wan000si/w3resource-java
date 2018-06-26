import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime_26 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Month month = localDate.getMonth();
        System.out.println("Integer value of the current month: " + month.getValue());
        System.out.println("Length of the month: " + month.length(localDate.isLeapYear()));
        System.out.println("Maximum length of the month: " + month.maxLength());
        System.out.println("First month of the Quarter: " + month.firstMonthOfQuarter());
    }
}

