public class implementatoin_ll {
    public static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void display_reccursion(Node head)
    {
        if(head==null)
            return;
        System.out.print(head.data+"->");
        display_reccursion(head.next);
    }

    public static void display_rev(Node head)
    {
        if(head==null)
            return;
        display_rev(head.next);
        System.out.print(head.data+"->");
    }
    public static void len(Node head)
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("count:"+count);
    }

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
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(6);
        Node d=new Node(9);
        Node e=new Node(16);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(b.next.data);
//        System.out.println(c.next.data);
//        System.out.println(d.next.data);
// or we can de the same thing using
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);

//        Node temp = a;
//        for(int i=0;i<5;i++)
//        {
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
        //better than for loop
//        while(temp!=null)
//        {
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
        display(a); //using function
        System.out.println("\n");
//       isplay_reccursion(a); //using recursion
//        display_rev(a);//reverse order printing
//        len(a);
    }
}
