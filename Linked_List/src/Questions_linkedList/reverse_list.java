package Questions_linkedList;

public class reverse_list {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }

    public static void display(Node head)
    {
        if(head==null)
        {
            return;
        }

        display(head.next);
        System.out.print(head.data+" ");
    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(4);
        Node d=new Node(2);
        Node e=new Node(7);
        Node f=new Node(9);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;

        display(a);

    }
}
