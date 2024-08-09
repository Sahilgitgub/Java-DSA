package Questions_linkedList;
// formula to fund nth node is (n-m+1)node from starting.
//1. firstly we have done it using two traversal meanis using using loops first for size and than for element
//2. in second case we have done it using single travrsal only.
public class nth_node_from_last {
        public static class Node{
            int data;
            Node next;
            Node(int data)
            {
                this.data=data;
            }
        }

    public static void main(String[] args) {

        Node a=new Node(10);
        Node b=new Node(101);
        Node c=new Node(102);
        Node d=new Node(103);
        Node e=new Node(104);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
//return from last.

//        Node t=nth_node(a,3);
//        System.out.println(t.data);

//        Node temp=Nth(a,1);
//        System.out.println(temp.data);

//return from first.

        Node f=return_first(a,4);
        System.out.println(f.data);
    }
    public static Node Nth(Node head,int n)
    {
        Node slow=head;
        Node fast =head;
        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }

        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }


    public static Node nth_node(Node head,int n) {
        int size=0;
        Node temp=head;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        temp=head;
        int m=size-n+1;
        for(int i=0;i<m-1;i++)
        {
            temp=temp.next;
        }
        return temp;

    }
//return from first
    public static Node return_first(Node head,int n)
    {
        Node first=head;
        for(int i=0;i<n-1;i++)
        {
            first=first.next;
        }
        return first;
    }
}
