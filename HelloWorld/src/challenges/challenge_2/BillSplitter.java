package challenges.challenge_2;

import java.util.Scanner;

public class BillSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bill value: ");
        double bill = scanner.nextDouble();

        System.out.print("Quantity of people sharing: ");
        int qtyPeopleSharing = scanner.nextInt();

        double valuePerPerson = bill / qtyPeopleSharing;

        System.out.format("Value per person: %.2f", valuePerPerson);
    }
}
