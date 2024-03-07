package classes;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10) + 1;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Guess Number Game!");
        System.out.println("Guess a number between 1 and 10:");

        while (!guessedCorrectly) {
            int guessedNumber = scanner.nextInt();
            if (guessedNumber < 1 || guessedNumber > 10) {
                System.out.println("Please enter a number between 1 and 10.");
            } else if (guessedNumber == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                guessedCorrectly = true;
            } else {
                System.out.println("Wrong guess. Try again!");
            }
        }

        scanner.close();
    }
}
