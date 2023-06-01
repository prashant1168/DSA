class Linklist {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        newNode.next = Head;
        Head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
    }

    public void print() {
        Node temp = Head;
        while (temp != null) {

            System.out.print(temp.data + "---->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insertBetwwn(int index, int data) {
        Node newNode = new Node(data);
        Node temp = Head;
        int i = 0;
        if (index == 0) {
            addFirst(data);
            return;
        }
        size++;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void deleteBetween(int Index) {
        Node temp = Head;
        int i = 0;
        if (Index == 0) {
            removeFirst();
            return;
        }
        // if (Index == size - 1) {
        // removeLast();
        // return;
        // }
        while (i < Index - 1) {

            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;

    }

    public void removeFirst() {
        if (Head == null) {
            System.out.println("already empty");
        }
        Node temp = Head;
        // Head = temp.next;
        if (temp.next == null) {
            Head = null;
        } else {
            Head = temp.next;
        }
        size--;
    }

    public void removeLast() {
        if (Head == null) {
            System.out.println("Empty Linklist");
        }
        if (Head.next == null) {
            // Head = null;
            removeFirst();

        }
        Node temp = Head;
        // Node temp2;
        // temp.next=temp2;

        while (temp.next.next != null) {
            temp = temp.next;

        }
        temp.next = null;
        Tail = temp;
        size--;

    }

    public void findIn(int num) {
        Node temp = Head;
        int i = 0;
        while (temp != null) {
            if (temp.data == num) {
                System.out.println("found at Index= " + i);
                return;
            }
            temp = temp.next;
            i++;
        }
        System.out.println("not in the link list");
    }

    public void searchIndex(int Index) {
        Node temp = Head;
        if (Index <= size - 1) {
            for (int i = 1; i <= Index; i++) {
                temp = temp.next;
            }
            System.out.println("value at Index: " + Index + " is = " + temp.data);
        } else {
            System.out.println("Out of bound");
        }
    }

    public void reverseLL() {
        Node prev = null;
        Node curr = Tail = Head;
        Node Next;
        while (curr != null) {

            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;

        }
        Head = prev;

    }

    public void getMiddle() {
        Node temp = Head;
        if (size % 2 == 0) {

            for (int i = 1; i < size / 2; i++) {
                temp = temp.next;
            }
            System.out.println(temp.data + "&" + temp.next.data);

        } else {
            for (int i = 1; i <= size / 2; i++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }

    }

    public static void main(String args[]) {
        Linklist l1 = new Linklist();
        l1.addFirst(20);
        // l1.print();
        l1.addFirst(21);
        l1.print();
        l1.addFirst(9);
        l1.print();
        l1.addLast(99);
        l1.print();
        l1.addLast(66);
        l1.print();
        l1.insertBetwwn(2, 11);
        l1.print();
        l1.insertBetwwn(0, 0);
        l1.print();
        System.out.println(l1.size);
        l1.removeFirst();
        l1.print();
        System.out.println(l1.size);
        // l1.removeLast();
        // l1.print();
        // System.out.println(l1.size);
        // l1.removeLast();
        // l1.print();
        // System.out.println(l1.size);
        // l1.reverseLL();
        // l1.print();
        // // l1.removeLast();
        // // l1.print();
        // // System.out.println(l1.size);
        // // l1.removeLast();
        // // l1.print();
        // // System.out.println(l1.size);
        // // l1.removeLast();
        // // l1.print();
        // // System.out.println(l1.size);
        // // l1.removeLast();
        // // l1.print();
        // // System.out.println(l1.size);
        // l1.deleteBetween(3);
        // l1.print();
        // System.out.println(l1.size);
        // l1.findIn(99);
        // l1.searchIndex(2);
        // l1.reverseLL();
        // l1.print();
        // l1.removeLast();
        // l1.print();
        l1.getMiddle();
        // Linklist l2 = new Linklist();
        // l2.addFirst(1);
        // l2.addFirst(2);
        // l2.addFirst(3);
        // l2.addFirst(4);
        // l2.addFirst(5);
        // l2.print();
        // System.out.println(l2.size);
        // l1.print();
        // System.out.println(l2.size);

    }
}
