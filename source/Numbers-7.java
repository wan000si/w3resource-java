import java.util.stream.Stream;

public class Numbers_7 {
    private int getLucas(int num) {
        if (num == 0) {
            return 2;
        }
        if (num == 1) {
            return 1;
        }
        return getLucas(num - 1) + getLucas(num - 2);
    }

    public static void main(String[] args) {
        System.out.println("First ten Lucas a numbers: ");
        Stream.iterate(0, n -> n + 1).map(item -> new Numbers_7().getLucas(item))
                .limit(10).forEach(System.out::println);

    }
}

