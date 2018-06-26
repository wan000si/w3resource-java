import java.time.Year;

public class DateTime_25 {
    public static void main(String[] args) {
        Year year = Year.now();
        System.out.println("Current Year: " + year);
        boolean isLeap = year.isLeap();
        System.out.println("Is current year leap year? " + isLeap);
        System.out.println("Length of the year: " + year.length() + " days");
    }
}
