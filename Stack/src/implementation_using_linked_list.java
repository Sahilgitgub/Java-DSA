public class implementation_using_linked_list {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static class stack
    {
        private Node head=null;
        private Node tail=null;
        private int size=0;
        void push(int data)
        {
            Node temp=new Node(data);
            if(head==null)
            {
                head=temp;
                tail=temp;
            }
            else {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
       int pop()
        {
            if(head==null)
            {
                System.out.println("Stack is empty");
                return -1;
            }
            int x=head.data;
            head=head.next;
            return x;
        }
        int peek()
        {
            if(head==null)
            {
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.data;
        }
        boolean isEmpty()
        {
            if(size==0)
            {
                return true;
            }
            return false;
        }
        int size()
        {
            return size;
        }
        void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        stack st=new stack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(6);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(7);
        st.push(0);
    }
}
