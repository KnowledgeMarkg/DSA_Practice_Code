import java.util.Scanner;

public class LovePercentageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name:");
        String name1 = scanner.nextLine();

        System.out.println("Enter the second name:");
        String name2 = scanner.nextLine();

        int lovePercentage = calculateLovePercentage(name1, name2);
        System.out.println("Love percentage between " + name1 + " and " + name2 + " is: " + lovePercentage + "%");

        scanner.close();
    }

    private static int calculateLovePercentage(String name1, String name2) {
        int totalScore = calculateNameScore(name1) + calculateNameScore(name2);
        int maxPossibleScore = 26 * Math.min(name1.length(), name2.length()); // Assuming all letters from A to Z appear at least once in each name

        // Calculate the percentage
        int percentage = (totalScore * 100) / maxPossibleScore;
        return percentage;
    }

    private static int calculateNameScore(String name) {
        int score = 0;
        for (char c : name.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                score += c - 'A' + 1; // Assuming A=1, B=2, ..., Z=26
            }
        }
        return score;
    }
}
