
import java.util.Scanner;

public class Demo018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        // Constants
        long MINUTES_IN_HOUR = 60;
        long MINUTES_IN_DAY = 60 * 24;
        long MINUTES_IN_YEAR = MINUTES_IN_DAY * 365;

        // Conversion
        long years = minutes / MINUTES_IN_YEAR;
        long remainingMinutes = minutes % MINUTES_IN_YEAR;
        long days = remainingMinutes / MINUTES_IN_DAY;
        long hours = (remainingMinutes % MINUTES_IN_DAY) / MINUTES_IN_HOUR;

        // Output the result
        System.out.println(minutes + " minutes is approximately: ");
        System.out.println(years + " years, " + days + " days, and " + hours + " hours.");

        scanner.close();
    }
}
