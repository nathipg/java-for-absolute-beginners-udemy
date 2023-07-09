package unit6_conditional_statements;

import java.util.Scanner;

public class WorkingWIthStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The VIP Lounge");

        System.out.print("Age: ");
        int age = scanner.nextInt();

        if(age >= 18) {
            System.out.print("Do you have a VIP pass? (yes/no): ");
            String vipPassReply = scanner.next();

            if(vipPassReply.toLowerCase().equals("yes") || age >= 70) {
                System.out.println("Go in");
            } else {
                System.out.println("You must be over 70 or have a VIP pass");
            }
        } else {
            System.out.println("You must be over 18");
        }
    }
}
