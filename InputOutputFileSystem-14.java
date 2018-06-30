import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputOutputFileSystem_14 {
    public static void main(String[] args) {
        File file = new File("E:/TWtest/myfile.txt");
        StringBuilder content = new StringBuilder();
        List<String> contentList = new ArrayList<>();
        String strLine = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((strLine = bufferedReader.readLine()) != null) {
                content.append(strLine);
                content.append(System.lineSeparator());
                contentList.add(strLine);
            }
            System.out.println(contentList);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
