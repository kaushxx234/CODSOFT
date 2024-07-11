import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int rounds = 0;

        while (true) {
            rounds++;
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 6;

            System.out.println("\nRound " + rounds + "!");
            System.out.println("I'm thinking of a number between 1 and 100.");

            while (attempts < maxAttempts) {
                attempts++;
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You found the number in " + attempts + " attempts.");
                    score += maxAttempts - attempts;
                    break;
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Game over! The number was " + numberToGuess + ".");
                System.out.println("Your score is " + score + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thanks for playing! Your final score is " + score + ".");
    }
}
