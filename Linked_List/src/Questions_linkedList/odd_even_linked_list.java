import java.util.*;
public class odd_even_linked_list {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static class linked_list
    {
        Node head=null;
        Node tail=null;
        public void add_last(int data)
        {
            Node temp=new Node(data);
            if(head==null)
            {
                head=temp;
                tail=temp;
            }

            else{
                tail.next=temp;
                tail=temp;
            }
        }
        public void oddEvenList() {
            if (head == null || head.next == null) {
                return;
            }

            Node odd = head;
            Node even = head.next;
            Node evenHead = even;

            while (even != null && even.next != null) {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }

            odd.next = evenHead;
        }
        void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        linked_list ll=new linked_list();
        for(int i=0;i<n;i++)
        {
            ll.add_last(sc.nextInt());
        }
        ll.oddEvenList();
        ll.display();
    }
}