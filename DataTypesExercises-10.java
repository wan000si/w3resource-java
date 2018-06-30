import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DataTypesExercises_10 {
    public static void main(String[] args) {
        System.out.print("Input six non-negative digits: ");
        Scanner input = new Scanner(System.in);

        int val = input.nextInt();
        List<Integer> list = new ArrayList<>();
        while (val / 10 != 0) {
            list.add(val % 10);
            val = val / 10;
        }
        list.add(val);
        Collections.reverse(list);
        list.stream().forEach(item-> System.out.print(item+" "));


    }
}
