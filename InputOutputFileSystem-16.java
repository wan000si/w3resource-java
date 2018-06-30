import java.io.*;

public class InputOutputFileSystem_16 {
    public static void writeFile(File file, String addText) {
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write(addText);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(File file) {
        StringBuilder content = new StringBuilder();
        String strLine = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((strLine = bufferedReader.readLine()) != null) {
                content.append(strLine);
                content.append(System.lineSeparator());
            }
            System.out.println(content);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        final String addText = "This is added to the file too.";
        File file = new File("E:/TWtest/myfile.txt");
        writeFile(file, addText);
        readFile(file);
    }
}
