import java.io.*;

public class InputOutputFileSystem_10 {
    public static void main(String[] args) {
        File file = new File("E:/TWtest/myfile.txt");
        InputStream inputStream = null;
        byte[] fileContent = new byte[2 * 1024];

        try {
            inputStream = new FileInputStream(file);
            int readCount = 0;
            while ((readCount = inputStream.read(fileContent)) > 0) {
                System.out.println(new String(fileContent, 0, readCount - 1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
