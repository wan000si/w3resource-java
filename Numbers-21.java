import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numbers_21 {
    private static List<Integer> getCubes(long num) {
        int count = 0;
        List<Integer> cubeList = new ArrayList<>();
        for (int i = 1; i < Math.floor(Math.pow(num, 1.0 / 3.0)); ++i) {
            double b = Math.round(Math.pow(num - Math.pow(i, 3), .0 / 3.0));
            if (i * i * i + b * b * b == num && !cubeList.contains(i)) {
                count++;
                cubeList.add(i);
                cubeList.add((int) b);
            }
        }
        return count > 1 ? cubeList : null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the boundary of Ramanujan numbers:");
        long num = input.nextLong();
        for (int i = 1; i < num; ++i) {
            List<Integer> cubeList = getCubes(i);
            if (cubeList != null) {
                System.out.printf("%d = %d^3 + %d^3 = %d^3 + %d^3%n",
                        i, cubeList.get(0), cubeList.get(1), cubeList.get(2), cubeList.get(3));
            }
        }
    }
}
