import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime_29 {
    public static void main(String[] args) {
        Scanner inputDate = new Scanner(System.in);
        System.out.println("Input a string(MMMM,d,yyyy)");
        LocalDate date = LocalDate.parse(inputDate.next(), DateTimeFormatter.ofPattern("MMMM,d,yyyy"));
        System.out.println("Date is: " + date);
    }
}
