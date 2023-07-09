package challenges.challenge_4;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "shark50";

        System.out.print("Enter the password: ");
        String userInput = scanner.nextLine();

        if(password.equals(userInput)) {
            System.out.println("Access approved");
        } else {
            System.out.println("Access denied");
        }
    }
}
