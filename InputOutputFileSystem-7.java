import java.io.File;
import java.util.Date;

public class InputOutputFileSystem_7 {
    public static void main(String[] args) {
        File file = new File("E:/TWtest/myfile.txt");
        Date date = new Date(file.lastModified());
        System.out.println("The date that the file was last modified is on: " + date);
    }

}
