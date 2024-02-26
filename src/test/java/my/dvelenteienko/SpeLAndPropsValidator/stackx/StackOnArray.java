package my.dvelenteienko.SpeLAndPropsValidator.stackx;

public class StackOnArray {

    private final Object[] stackArray;
    private int top;
    private final int maxSize;

    public StackOnArray(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new Object[maxSize];
        this.top = -1;
    }

    public void push(long value) {
        this.stackArray[++top] = value;
    }

    public Object pop() {
        return this.stackArray[top--];
    }

    public Object peek() {
        return this.stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
