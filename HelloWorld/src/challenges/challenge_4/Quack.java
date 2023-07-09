package challenges.challenge_4;

public class Quack {
    public static void main(String[] args) {
        for(int i = 1; i <= 40; i++) {
            System.out.println(i);

            if(i % 3 == 0) {
                System.out.println("Quack");
            }
        }
    }
}
