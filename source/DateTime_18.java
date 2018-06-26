import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTime_18 {
    private int year;

    public  boolean isLeap(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public void enter() {
        Scanner inputYear = new Scanner(System.in);
        int year = inputYear.nextInt();
        if (isLeap(year)) {
            System.out.println("Year " + year + " is a leap year!");
        } else {
            System.out.println("Year " + year + " is not a leap year!");
        }
    }
    public static void main(String[] args) {
        new DateTime_18().enter();
    }
}
