package unit8_arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {75, 29, 350, 7};

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for(int i = numbers.length - 1; i >= 0 ; i--) {
            System.out.println(numbers[i]);
        }

        int[] foo = {1, 2, 3};
        int[] bar = new int[3];
        bar[0] = 1;
        bar[1] = 2;
        bar[2] = 3;

        for(int b : bar) {
            System.out.println(b);
        }

        int numbersOfLaps = 4;
        double[] laps = new double[numbersOfLaps];

        for(int i = 0; i < numbersOfLaps; i++) {
            laps[i] = 10;
        }
    }
}
