package unit3_helloworld.sec5_user_input;

import java.util.Scanner;

public class UserInput1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something: ");
        String input = sc.nextLine();
        System.out.printf("You entered %s", input);
    }
}
