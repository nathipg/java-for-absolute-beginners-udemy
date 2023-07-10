package unit14_oop2;

import unit14_oop2.p1.A;
import unit14_oop2.p2.B;
import unit14_oop2.p3.C;

public class Main {
    public static void main(String[] args) {
        B b = new B(2, 3);
        C c = new C(4, 5, 6);

        System.out.println(b.v1);
        System.out.println(b.v2);
        b.method1();

        System.out.println(c.v1);
        System.out.println(c.v2);
        System.out.println(c.v3);
        c.method1();

        printV1(b);
        printV1(c);
    }

    public static void printV1(A a) {
        System.out.println(a.v1);
    }
}
