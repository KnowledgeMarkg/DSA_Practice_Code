import java.util.Scanner;

public class LoveCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name1 = scanner.nextLine();

        System.out.println("Enter your partner's name: ");
        String name2 = scanner.nextLine();

        // Calculate love percentage (just a basic example)
        int lovePercentage = calculateLovePercentage(name1, name2);

        System.out.println("Love Percentage between " + name1 + " and " + name2 + " is: " + lovePercentage + "%");
        scanner.close();
    }

    private static int calculateLovePercentage(String name1, String name2) {
        // Just a basic example calculation
        // You can replace this with your own logic for calculating love percentage
        // For example, you can calculate it based on the length of the names or some other algorithm
        int maxLength = Math.max(name1.length(), name2.length());
        int minLength = Math.min(name1.length(), name2.length());

        double similarity = (double) minLength / maxLength;
        int lovePercentage = (int) (similarity * 100);

        return lovePercentage;
    }
}
