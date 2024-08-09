package Questions_linkedList;

public class find_middle_element {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static void ll(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
    }

    public static Node middle_element(Node head)
    {
        Node slow=head;
        Node fast=head;
                //even                  //odd
        while(fast!=null && fast.next!=null )
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(200);
        Node c=new Node(300);
        Node d=new Node(400);
        Node e=new Node(500);
//        Node f=new Node(600);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
//        e.next=f;

//        ll(a);
        Node middle=middle_element(a);
        System.out.println(middle.data);
    }

//    if you want to find right middle in even number of elements:- fast!=null
//    if you want to find left middle in even number of elements:- fast.next.next!=null
//    if you want to find  middle in dd number of elements:- fast.next!=null
}
