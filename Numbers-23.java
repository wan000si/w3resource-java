import java.util.Arrays;

public class Numbers_23 {
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
        for (int i = 1; i < 1000; ++i) {
            if (isNarcissistic(i)) {
                System.out.println(i);
            }
        }
    }
}
