package Questions_linkedList;

//thid code is for deleeting right middle element..
public class delete_miidle_element {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
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
//        delete_miidle(a);
//        display(a);
        deleteNode(a);
        display(a);
    }
    public static void delete_miidle(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast.next.next!=null && fast.next.next.next!=null)
        {
            slow=slow.next ;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
//        return head;
    }
    public static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static  void deleteNode(Node node) {
        if(node.next==null)
        {
            return ;
        }
        Node slow = node;
        Node fast = node;
        while(fast.next.next!=null && fast.next.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;

//        return node;
    }


}
