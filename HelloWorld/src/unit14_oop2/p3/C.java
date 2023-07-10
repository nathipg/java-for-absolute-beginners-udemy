package unit14_oop2.p3;

import unit14_oop2.p2.B;

public class C extends B {
    public int v3 = 3;

    public C(int v1, int v2, int v3) {
        super(v1, v2);
        this.v3 = v3;
    }

    @Override
    public void method1() {
        super.method1();
        System.out.println("Method 1 C");
    }
}
