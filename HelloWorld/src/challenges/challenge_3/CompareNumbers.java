package challenges.challenge_3;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("X: ");
        int x = scanner.nextInt();

        System.out.print("Y: ");
        int y = scanner.nextInt();

        if(x > y) {
            System.out.println("X is bigger than Y");
            System.out.println("The difference between X and Y is: " + (x - y));
        } else if(y > x) {
            System.out.println("Y is bigger than X");
            System.out.println("The difference between X and Y is: " + (y - x));
        } else {
            System.out.println("X is equal Y");
        }
    }
}
