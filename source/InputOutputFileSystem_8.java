import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutputFileSystem_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input something: ");
        String inputStr = bufferedReader.readLine();
        System.out.println("Read input from java console: " + inputStr);
        bufferedReader.close();
    }
}
