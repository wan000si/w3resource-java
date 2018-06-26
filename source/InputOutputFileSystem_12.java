import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputOutputFileSystem_12 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String strLine = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("E:/TWtest/myfile.txt"));
            while ((strLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(strLine);
                stringBuilder.append(System.lineSeparator());
            }
            System.out.println(stringBuilder);
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
