import java.io.File;
import java.io.FilenameFilter;

public class InputOutputFileSystem_2 {
    public static void main(String[] args) {
        File file = new File("E:/TWtest");
        String[] fileList = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".java")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        for (String filename : fileList) {
            System.out.println(filename);
        }
    }
}
