package challenges.challlenge_4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessWhich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isAnswerCorrect = false;
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guessesNumber = 0;

        do {
            System.out.print("Guess which number I've choose (1-100): ");
            int guess = scanner.nextInt();
            guessesNumber++;

            if(guess == randomNumber) {
                System.out.println("CORRECT");
                System.out.println("Number of tries: " + guessesNumber);
                isAnswerCorrect = true;
            } else if(guess > randomNumber) {
                System.out.println("LOWER");
            } else if (guess < randomNumber) {
                System.out.println("HIGHER");
            }
        } while(!isAnswerCorrect);
    }
}
