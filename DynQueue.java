public class DynQueue {
    public class Qnode {
        private int data;
        private Qnode next;

        public Qnode(int data) {
            this.data = data;
            this.next = null;

        }

        public int getData() {
            return data;
        }

        public Qnode getNext() {
            return next;
        }

        public void setData(int data) {
            this.data = data;

        }

        public void setNext(Qnode next) {
            this.next = next;
        }
    }

    private Qnode front, rear;

    public DynQueue() {
        this.front = null;
        this.rear = null;
    }

    public Qnode getFront() {
        return front;
    }

    public Qnode getRear() {
        return rear;
    }

    public void setFront(Qnode front) {
        this.front = front;

    }

    public void setRear(Qnode rear) {
        this.rear = rear;
    }

    public void enque(int v) {
        Qnode nn = new Qnode(v);
        if (nn == null)
            return;
        if (rear == null) {
            rear = front = nn;
        } else {
            rear.setNext(nn);
            rear = nn;
        }
    }

    public boolean isEmpty() {
        if (rear == null)
            return true;

        return false;

    }

    public int deque() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        } else {
            Qnode temp = front;
            front = front.getNext();
            temp.setNext(null);
            return temp.getData();
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("queue is Empty");

        } else {
            System.out.print("Queue starting --");
            for (Qnode temp = front; temp != null; temp = temp.getNext()) {
                System.out.print(temp.getData() + "--");
            }
            System.out.println("queue ending");

        }
    }

    public static void main(String args[]) {
        DynQueue dq = new DynQueue();
        dq.enque(5);
        dq.enque(6);
        dq.display();
        dq.deque();
        dq.display();
    }
}
