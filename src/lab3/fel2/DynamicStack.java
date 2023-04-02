package lab3.fel2;

public class DynamicStack {
    private int[] stack;
    private int top;
    private int capacity;

    public DynamicStack() {
        capacity = 10; // initial capacity
        stack = new int[capacity];
        top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            // increase capacity by doubling it
            int[] newStack = new int[capacity * 2];
            System.arraycopy(stack, 0, newStack, 0, capacity);
            capacity *= 2;
            stack = newStack;
        }
        stack[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int item = stack[top--];
        if (size() <= capacity / 4) {
            // decrease capacity by half
            int[] newStack = new int[capacity / 2];
            System.arraycopy(stack, 0, newStack, 0, size());
            capacity /= 2;
            stack = newStack;
        }
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public int[] getStack() {
        return stack;
    }
}

