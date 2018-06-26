import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputOutputFileSystem_17 {
    public static void main(String[] args) {
        File file = new File("E:/TWtest/myfile.txt");
        String strLine = "";
        try {
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream(file)));

            while (((strLine = reader.readLine()) != null) && (reader.getLineNumber() <= 3)) {
                System.out.println(strLine);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
