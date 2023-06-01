public class Queue {
    private int data[];
    private int r, f;

    public Queue(int size) {
        data = new int[size];
        r = f = -1;
    }

    public int getR() {
        return r;
    }

    public int getF() {
        return f;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setF(int f) {
        this.f = f;
    }

    public boolean isEmpty() {
        if (r == -1)
            return true;
        return false;

    }

    public boolean isFull() {
        if (r == data.length - 1)
            return true;
        return false;
    }

    public void enque(int v) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        if (r == -1)
            f = 0;
        data[++r] = v;

    }

    public int deque() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int v = data[f++];
        if (f == r + 1)
            r = f = -1;
        return v;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        for (int i = f; i <= r; i++) {
            System.out.println(data[i]);
        }
    }

    public int peak() {
        if (isEmpty()) {
            System.out.println("Quene is empty");
            return -1;
        }
        return data[f];
    }

    public static void main(String args[]) {
        Queue q1 = new Queue(6);
        q1.enque(7);
        q1.enque(5);
        q1.enque(7);
        q1.enque(5);
        q1.enque(7);
        q1.enque(5);
        q1.enque(7);
        q1.enque(5);
        q1.display();
        q1.peak();
        // q1.deque();
        // q1.deque();
        // q1.display();
    }
}
