package Questions_linkedList;

public class Delete_nth_from_end {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }

    public static Node delete_nth(Node head,int n)
    {
        Node slow=head;
        Node fast=head;
        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }
        if(fast==null)
        {
            head=head.next;
            return head;
        }

        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }

    public static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(200);
        Node c=new Node(300);
        Node d=new Node(400);
        Node e=new Node(500);
        Node f=new Node(600);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        display(a);
        a=delete_nth(a,6);
        display(a);
    }
}