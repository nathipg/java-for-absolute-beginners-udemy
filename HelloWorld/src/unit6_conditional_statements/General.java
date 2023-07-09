package unit6_conditional_statements;

import java.util.Scanner;

public class General {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Super Fast Roller coaster");
        System.out.print("Please enter your height in cm: ");
        int height = scanner.nextInt();

        if(height < 130 || height > 210)  {
            System.out.println("Height not accepted");
        } else {
            System.out.println("Height OK, go ahead");
        }
    }
}
