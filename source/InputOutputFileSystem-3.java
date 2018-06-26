import java.io.File;

public class InputOutputFileSystem_3 {
    public static void main(String[] args) {
        File file = new File("E:/TWtest/myfile.txt");
        if (file.exists()) {
            System.out.println("The file or directory exists.");
        } else {
            System.out.println("The file or directory doesnot exist.");
        }
    }
}
