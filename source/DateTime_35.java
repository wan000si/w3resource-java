import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DateTime_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two dates(YY-MM-DD HH:MM:SS): ");
        LocalDateTime date = LocalDateTime.parse(input.next());
        String str = new SimpleDateFormat("MM/dd/yyyy,H:mm:ss").format(date);
        System.out.println(str);
    }
}
