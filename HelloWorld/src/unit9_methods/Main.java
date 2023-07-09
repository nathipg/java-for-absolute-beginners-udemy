package unit9_methods;

public class Main {
    public static void main(String[] args) {
        System.out.println("main");
        foo(10);
        System.out.println("Bar return " + bar(3));
        System.out.println("Cone volume: " + calcConeVolume(3, 2));
    }

    public static void foo(int a) {
        if(a % 2 != 0) {
            return;
        }

        System.out.println("foo " + a);
    }

    public static double bar(int a) {
        return (double) a / 2;
    }

    public static double calcConeVolume(double r, double h) {
        return Math.PI * r * r * h / 3;
    }
}
