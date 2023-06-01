public class Scll {
    public class Node {
        int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head, tail;
    public int size;

    public Scll() {
        this.head = null;
        this.tail = null;

    }

    public Scll(int size) {
        this.size = size;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public boolean insertAtBeg(int data) {
        Node newNode = new Node(data);
        if (newNode == null)
            return false;
        size++;
        if (head == null) {
            head = tail = newNode;
            head.setNext(head);
        } else {
            newNode.setNext(head);
            head = newNode;
            tail.setNext(head);
        }
        return true;

    }

    public boolean insertAtLast(int data) {
        Node newNode = new Node(data);
        if (newNode == null)
            return false;
        size++;
        if (head == null) {
            head = tail = newNode;
            head.setNext(head);
        } else {
            tail.setNext(newNode);
            newNode.setNext(head);
            tail = newNode;
        }
        return true;

    }

    public boolean deleteAtbeg() {
        if (head == null)
            return false;
        size--;
        head = head.getNext();
        tail.getNext().setNext(null);
        tail.setNext(head);
        return true;

    }

    public boolean deleteAtLast() {
        if (head == null)
            return false;
        size--;
        Node temp = head;
        while (temp.getNext().getNext() != head) {
            temp = temp.getNext();
        }
        temp.setNext(head);
        tail = temp;
        return true;
    }

    public void checkCircularity(int size) {
        Node temp = head;
        // while (temp.getNext() != head.getNext()) {
        // temp = temp.getNext();
        // }
        for (int i = 1; i <= size; i++) {
            temp = temp.next;
        }
        if (temp == head) {
            System.out.println("circular");
        } else {
            System.out.println("not circular");
        }
    }

    public void display() {
        Node temp = head;
        System.out.print("----Head==>");
        while (temp.getNext() != head) {
            System.out.print(temp.getData() + "<==>");
            temp = temp.getNext();
        }
        System.out.println(temp.getData() + "<==>Tail----");
    }

    public void search(int search) {
        Node temp = head;
        for (int i = 1; i <= size; i++) {
            if (temp.getData() == search) {
                System.out.println("found at index: " + (i - 1));
                return;
            } else {
                temp = temp.next;
            }
        }
        System.out.println("enter valid");
    }

    public void reverse() {
        Node pre = null, curr, nex;
        curr = head;
        tail = curr;
        while (curr != head) {
            nex = curr.getNext();
            curr.setNext(pre);
            pre = curr;
            curr = nex;
        }
        head = curr;

    }

    public static void main(String args[]) {
        Scll s = new Scll();
        s.insertAtBeg(5);
        s.insertAtBeg(6);
        s.insertAtLast(9);
        s.insertAtLast(99);
        // s.deleteAtbeg();
        // s.deleteAtLast();
        s.display();
        System.out.println("size: " + s.size);
        s.checkCircularity(s.size);
        s.search(9);
        s.reverse();
        s.display();
    }
}
