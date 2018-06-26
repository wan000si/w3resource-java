import static java.util.stream.LongStream.rangeClosed;

public class Numbers_2 {

    private int countOfAbundant = 0;
    private int countOfDeficient = 0;
    private int countOfPerfect = 0;

    public static Long sumOfDivisors(long num) {
        return rangeClosed(1, (num + 1) / 2).filter(item -> num % item == 0 && num != item).sum();
    }

    public void countClassifiedNumbers() {
        for (long i = 1; i < 10000L; ++i) {
            long sum = sumOfDivisors(i);
            if (sum < i) {
                countOfDeficient++;
            } else if (sum == i) {
                countOfPerfect++;
            } else {
                countOfAbundant++;
            }
        }
    }

    public void printResults() {
        System.out.println("Number Counting [(integers) between 1 to 10,000]:  ");
        System.out.println("Deficient number: " + countOfDeficient);
        System.out.println("Perfect number: " + countOfPerfect);
        System.out.println("Abundant number: " + countOfAbundant);
    }

    public void enter() {
        countClassifiedNumbers();
        printResults();
    }

    public static void main(String[] args) {
        new Numbers_2().enter();
    }
}
