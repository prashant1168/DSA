import java.util.Scanner;

public class DoubleLL {
    public class Node {
        public class Student {
            private int roll;
            private String name;

            public Student(int roll, String name) {
                this.roll = roll;
                this.name = name;
            }

            public int getRoll() {
                return roll;
            }

            public String getName() {
                return name;
            }

            public void setRoll(int roll) {
                this.roll = roll;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        Student data;
        Node next, prev;

        public Node(Student data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public Student getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setStudent(Student data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }

    Node head, tail;
    Scanner sc;

    public DoubleLL() {
        this.head = null;
        this.tail = null;
        sc = new Scanner(System.in);
    }

    public boolean insertAtBeg() {
        System.out.println("enter name and roll no of student");
        Student ns = new Student(sc.nextInt(), sc.next());
        Node nn = new Node(ns);
        if (nn == null)
            return false;
        if (head == null) {
            head = tail = null;
        } else {
            nn.setNext(head);
            head.setPrev(nn);
            head = nn;
        }
        return true;
    }

    public boolean insertAtLast() {
        System.out.println("enter name and roll no of student");
        Student ns = new Student(sc.nextInt(), sc.next());
        Node nn = new Node(ns);
        if (nn == null)
            return false;
        if (head == null) {
            head = tail = nn;
        } else {
            nn.setPrev(tail);
            nn.setNext(head);
            tail = nn;
        }
        return true;
    }

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData().getName());
            temp.getNext();
        }
    }

    public static void main(String args[]) {
        DoubleLL dl = new DoubleLL();
        dl.insertAtBeg();
        dl.insertAtLast();
        dl.Display();

    }

}
