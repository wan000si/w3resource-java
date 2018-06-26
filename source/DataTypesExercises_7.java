import java.util.Scanner;

public class DataTypesExercises_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input distance in meters:");
        double distance = input.nextDouble();
        System.out.println();

        System.out.print("Input hour:");
        int hours= input.nextInt();
        System.out.println();

        System.out.print("Input minutes:");
        int minutes= input.nextInt();
        System.out.println();

        System.out.print("Input seconds:");
        int seconds= input.nextInt();
        System.out.println();

        long totalSeconds = seconds + minutes * 60 + hours * 3600;

        double speedInMetersPerSecond = distance / totalSeconds;
        System.out.println("Your speed in meters/second is " + speedInMetersPerSecond);

        double speedInKmPerHour = (distance/100)/( totalSeconds/ 3600);
        System.out.println("Your speed in km/h is " + speedInKmPerHour);

        double speedInMilesPerHour = (distance/1069)/( totalSeconds/ 3600);
        System.out.println("Your speed in miles/h is " + speedInMilesPerHour);

    }
}
