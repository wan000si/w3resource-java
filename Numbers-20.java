import java.util.stream.Stream;

public class Numbers_20 {
    public static double getFermat(long num) {
        return Math.pow(2, Math.pow(2, num)) + 1;
    }

    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 1)
                .map(item -> getFermat(item)).limit(10)
                .forEach(System.out::println);
    }
}
