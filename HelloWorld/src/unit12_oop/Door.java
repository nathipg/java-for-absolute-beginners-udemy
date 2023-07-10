package unit12_oop;

public class Door {
    private boolean isOpen;

    public Door() {
        isOpen = false;
    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    public void printStatus() {
        System.out.println(isOpen ? "Open" : "Closed");
    }
}
