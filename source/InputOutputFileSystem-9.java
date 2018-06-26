import java.io.File;

public class InputOutputFileSystem_9 {
    public static void main(String[] args) {
        File file = new File("E:/TWtest/myfile.txt");
        if (file.exists()) {
            System.out.println("The size of the file is " + file.length() + "bytes.");
            System.out.println("The size of the file is " + file.length() / 1024 + "kb.");
            System.out.println("The size of the file is " + file.length() / (1024 * 1024) + "mb.");
        } else {
            System.out.println("The file doesnot exit.");
        }
    }
}
