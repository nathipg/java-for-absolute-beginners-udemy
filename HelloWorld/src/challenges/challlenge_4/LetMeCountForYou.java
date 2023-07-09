package challenges.challlenge_4;

public class LetMeCountForYou {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            System.out.print(i);

            if(i == 10) {
                System.out.print(".");
            } else {
                System.out.print(", ");
            }
        }
    }
}
