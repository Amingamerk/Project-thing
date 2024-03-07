package classes;

import java.util.Scanner;

public class Game {
    public Game(){

    }

    public int play(){
        
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10) + 1;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Guess Number Game!");
        System.out.println("Guess a number between 1 and 10:");

        int guessedNumber = 0;

        while (!guessedCorrectly) {
             guessedNumber = scanner.nextInt();
            if (guessedNumber < 1 || guessedNumber > 10) {
                System.out.println("Please enter a number between 1 and 10.");
            } else if (guess(guessedNumber, randomNumber)) {
                System.out.println("Congratulations! You guessed the correct number.");
                guessedCorrectly = true;
            } else {
                System.out.println("Wrong guess. Try again!");
            }
        }

        scanner.close();

        return guessedNumber;
    }

    public boolean guess(int guess, int number){
        if (guess == number) return true;
        return false;
        
    }
}
