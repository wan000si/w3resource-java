import java.io.*;

public class InputOutputFileSystem_13 {
    public static void main(String[] args) {
        File file = new File("E:/TWtest/myfile.txt");
        StringBuilder stringBuilder = new StringBuilder();
        String strLine = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((strLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(strLine);
            }
            System.out.println(stringBuilder);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
