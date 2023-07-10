package unit14_oop2.p1;

public abstract class A implements Interface1 {
    public int v1;
    private int v4 = 4;
    protected int v5 = 5;
    int v6 = 6;

    public A(int v1) {
        this.v1 = v1;
    }

    @Override
    public void method1() {
        System.out.println("Method 1 A");
    }
}
