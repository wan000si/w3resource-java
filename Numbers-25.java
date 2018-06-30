import java.util.Arrays;
import java.util.stream.Stream;

public class Numbers_25 {
    public static int getPell(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }

        return getPell(num - 1) * 2 + getPell(num - 2);
    }

    public static void main(String[] args) {
        System.out.println("First 20 Pell numbers:");
        Stream.iterate(1, n -> n + 1)
                .map(item -> getPell(item)).limit(20)
                .forEach(item -> System.out.println(item + " "));
    }
}
