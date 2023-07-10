package unit14_oop2.p2;

import unit14_oop2.p1.A;

public class B extends A {
    public int v2 = 2;

    public B(int v1, int v2) {
        super(v1);

        this.v2 = v2;
    }
}
