package challenges.challenge_5;

public class PopulateAndReversePrint {
    public static void main(String[] args) {
        int[] numbers = new int[20];

        for(int i = 0; i < 20; i++) {
            numbers[i] = i + 1;
        }

        for(int i = numbers.length -1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
