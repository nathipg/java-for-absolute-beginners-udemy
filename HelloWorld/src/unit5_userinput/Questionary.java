package unit5_userinput;

import java.util.Scanner;

public class Questionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println(name + " is a nice name");
        System.out.println("Your name have " + name.length() + " characters");

        System.out.print("\nHow old are you? ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old");
        System.out.println("You have lived " + age + " years. In another " + age + " years you will be " + age * 2 + " years old");

        System.out.print("\nHow tall are you in metres? ");
        double height = scanner.nextDouble();
        System.out.println("Your are " + height + " metres tall");

        double diffAverageMaleHeight = height - 1.75;
        double diffAverageFemaleHeight = height - 1.62;
        System.out.println("\n The difference between your height and the average is: ");
        System.out.format("%.2fm if you are male\n", diffAverageMaleHeight);
        System.out.format("%.2fm if you are female\n", diffAverageFemaleHeight);
    }
}
