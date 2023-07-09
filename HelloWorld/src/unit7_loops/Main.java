package unit7_loops;

public class Main {
    public static void main(String[] args) {
        System.out.println("For");
        for (int i = 0; i < 5; i++) {
            if(i == 2) {
                continue;
            }

            if(i == 4) {
                break;
            }

            System.out.println("i is " + i);
        }

        System.out.println("While");
        int i = 0;
        while(i < 5) {
            System.out.println("i is " + i);
            i++;
        }

        System.out.println("Do While");
        i = 0;

        do {
            System.out.println("i is " + i);
            i++;
        } while(i < 5);
    }
}
