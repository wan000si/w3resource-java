import java.io.File;

public class InputOutputFileSystem_6 {
    public static void main(String[] args) {
        File file1 = new File("E:/TWtest/myfile.txt");
        File file2 = new File("E:/TWtest/itstest.txt");

        String compareResult;
        if (file1.compareTo(file2) == 0) {
            compareResult = "=";
        } else if (file1.compareTo(file2) < 0) {
            compareResult = "<";
        } else {
            compareResult = ">";
        }
        System.out.println(file1.getAbsolutePath() + compareResult + file2.getAbsolutePath());
    }

}
