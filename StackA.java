import java.nio.ReadOnlyBufferException;

public class StackA {
    int data[];
    int top;

    public StackA(int size) {
        data = new int[size];
        top = -1;
    }

    public int getTop() {
        return top;
    }

    public void setTop() {
        this.top = top;
    }

    public boolean isFull() {
        if (top == data.length - 1)
            return true;
        return false;

    }

    public boolean isEmpty() {
        if (top == -1)
            return true;
        return false;
    }

    public void push(int v) {
        if (isFull()) {
            System.out.println("Stack is Full/stack_over_flow");
            return;
        }
        data[++top] = v;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("stack underflow");
            return;

        }
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return -1;
        }
        return data[top--];
    }

    public int peak() {
        if (isEmpty()) {
            System.out.println("Empty stack");
            return -1;
        }
        return data[top];
    }

    public static void main(String args[]) {
        StackA s = new StackA(10);
        // s.push(12);
        // s.push(13);
        // s.push(2);
        s.push(8);
        s.push(99);
        // s.pop();
        s.display();
        // s.pop();
        s.peak();
    }
}