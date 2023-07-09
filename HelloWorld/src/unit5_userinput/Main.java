package unit5_userinput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String input = scanner.next();
        System.out.println(input);
    }
}
