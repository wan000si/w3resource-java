import java.io.File;

public class InputOutputFileSystem_5 {
    public static void main(String[] args) {
        File file = new File("E:/TWtest/myfile.txt");
        if (file.isDirectory()) {
            System.out.println(file.getAbsolutePath() +"is a directory.");
        }
        if (file.isFile()) {
            System.out.println(file.getAbsolutePath() + "is a file.");
        }
    }
}
