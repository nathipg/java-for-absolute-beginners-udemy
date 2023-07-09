package challenges.challenge_3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessWhich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        int chances = 2;

        while(chances > 0) {
            System.out.print("Guess which number I've choose (1-5): ");
            int playerNumber = scanner.nextInt();

            if(randomNumber == playerNumber) {
                System.out.println("Lucky you");
                chances = 0;
            } else {
                System.out.println("You loser");
                chances--;
            }
        }
    }
}
