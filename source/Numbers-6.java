import java.util.Arrays;
import java.util.stream.Stream;

public class Numbers_6 {
    public static boolean isNarcissistic(int num) {
        if (num < 0) {
            return false;
        }
        String str = String.valueOf(num);
        return num== Arrays.stream(str.split(""))
                .map(item->Math.pow(Integer.parseInt(item),str.length()))
                .reduce((x,y)->x + y).get();
    }

    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 1).filter(item -> isNarcissistic(item)).limit(15)
                .forEach(item -> System.out.println(item + " "));

    }
}
