class Dll {
    class Node {
        Node next;
        Node prev;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        newNode.prev = head;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + "<=>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addBetween(int index, int data) {
        Node newNode = new Node(data);
        if (head == null || index == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < index - 1 && i < size - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;

    }

    public static void main(String args[]) {
        Dll d1 = new Dll();
        d1.addFirst(5);
        d1.addFirst(9);
        d1.addFirst(4);
        d1.addFirst(2);
        d1.addLast(1);
        d1.print();
        System.out.println(d1.size);
        d1.addLast(7);
        d1.print();
        System.out.println(d1.size);
        d1.addBetween(2, 11);
        d1.print();
        System.out.println(d1.size);
        d1.addBetween(0, 111);
        d1.print();
        System.out.println(d1.size);
        d1.addFirst(1);
        d1.print();
        System.out.println(d1.size);

    }
}