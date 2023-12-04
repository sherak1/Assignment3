package task2;

public class MyStack {
    private int[] elements;
    private int size;
    private static final int def = 10;

    public MyStack() {
        elements = new int[def];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}