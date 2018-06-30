import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Numbers_9 {
    public static boolean isHappyNum(long num) {
        if (num == 1) {
            return true;
        }
        String str = String.valueOf(num);
        return isHappyNum(Arrays.stream(str.split(""))
                .map(item -> Math.pow(Integer.parseInt(item), 2))
                .reduce((x, y) -> x + y).get()
                .longValue());

    }

    public static void main(String[] args) {
        System.out.println("First 10 Happy numbers: ");
        Stream.iterate(1, n -> n + 1)
                .filter(item -> isHappyNum(item))
                .limit(10).forEach(System.out::println);
    }
}
