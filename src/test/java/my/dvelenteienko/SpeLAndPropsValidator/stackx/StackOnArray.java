package my.dvelenteienko.SpeLAndPropsValidator.stackx;

public class StackOnArray {

    private final Object[] stackArray;
    private int top;
    private int maxSize;

    public StackOnArray(int maxSize) {
        this.stackArray = new Object[maxSize];
        this.top = -1;
        this.maxSize = maxSize;
    }

    public void push(long value) {
        stackArray[++top] = value;
    }

    public Object pop() {
        return stackArray[top--];
    }

    public Object peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
