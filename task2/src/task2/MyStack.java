package task2;

import java.util.Arrays;

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
    
    public void push(int value) {
        eCapacity();
        elements[size++] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int poppedVa = elements[--size];
        elements[size] = 0;  // clear the reference  
        return poppedVa;
    }

    private void eCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, 2 * size);
        }
    }

    
     
    
}