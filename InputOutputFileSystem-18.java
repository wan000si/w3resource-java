import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputOutputFileSystem_18 {
    public static String findLongestWord(File file) throws FileNotFoundException {
        String longestWord = "";
        String curWord;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            curWord = scanner.next();
            if (curWord.length() > longestWord.length()) {
                longestWord = curWord;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E:/TWtest/myfile.txt");
        System.out.println("Tht longest word in the file: "+findLongestWord(file));
    }
}
