import java.io.*;

public class InputOutputFileSystem_11 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        String strLine = "";
        try {
            bufferedReader = new BufferedReader(new FileReader("E:/TWtest/myfile.txt"));
            while ((strLine = bufferedReader.readLine()) != null) {
                System.out.println(strLine);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
