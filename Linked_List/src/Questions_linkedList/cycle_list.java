package Questions_linkedList;

public class cycle_list {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(100);
        Node c = new Node(100);
        Node d = new Node(100);
        Node e = new Node(100);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
    }
}
