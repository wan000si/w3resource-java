import java.io.File;

public class InputOutputFileSystem_1 {
    public static void main(String[] args) {
        File file = new File("E:/TWtest");
        String[] fileList = file.list();
        for (String filename : fileList) {
            System.out.println(filename);
        }
    }
}
