import java.io.File;

public class InputOutputFileSystem_4 {
    public static void main(String[] args) {
        File file = new File("E:/TWtest/myfile.txt");
        if (file.canRead()) {
            System.out.println(file.getAbsolutePath() + "can be read.");
        } else {
            System.out.println(file.getAbsolutePath() + "cannot be read.");
        }
        if (file.canWrite()) {
            System.out.println(file.getAbsolutePath() + "can be written.");
        } else {
            System.out.println(file.getAbsolutePath() + "cannot be written.");
        }
    }
}
