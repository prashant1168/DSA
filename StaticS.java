public class StaticS {
    public class Node {
        private Node prev;
        private int data;

        public Node(int data) {
            this.data = data;
            this.prev = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getPrev() {
            return prev;
        }

        public Node setPrev(Node prev) {
            return this.prev = prev;
        }
    }

    Node top;

    public StaticS() {
        this.top = null;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
            return;
        }
        newNode.setPrev(top);
        top = newNode;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("empty stack");
            return;
        }

        for (Node t = top; t != null; t = t.getPrev()) {
            System.out.println(t.getData());

        }

    }

    public static void main(String args[]) {
        StaticS s = new StaticS();
        s.push(9);
        s.push(7);
        s.push(5);
        s.display();
    }
}
