public class Main {
    class Node{
        int data;
        Node next;
    }
    Node head=null;
    Node tail=null;
    int size=0;
    public void addFirst(int val) {
        Node nm=new Node();
        nm.data=val;
        if(size==0) {
            head=nm;
            tail=nm;
        }
        else {
            nm.next=head;
            head=nm;
        }
        size++;
    }
    public void display() {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+"------->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public void addLast(int val) {
        if(size==0) {
            addFirst(val);
        }
        else {
            Node nm=new Node();
            nm.data=val;
            tail.next=nm;
            tail=nm;
            size++;
        }
    }
    public void addAtk(int val,int k) {
        if(k==0) {
            addFirst(val);
        }
        else if(k==size){
            addLast(val);
        }
        else {
            Node temp=getNode(k-1); // Corrected the index
            Node temp2=temp.next;
            Node nn=new Node();
            nn.data=val;
            temp.next=nn;
            nn.next=temp2;
            size++;
        }
    }
    public Node getNode(int k) {
        Node temp=head;
        for(int i=0;i<k;i++) { // Corrected the loop condition
            temp=temp.next;
        }
        return temp;
    }
    public int getvalue(int k) {
        if(k==0) {
            return head.data;
        }
        else if(k==size) {
            return tail.data;
        }
        else {
            return getNode(k).data;
        }
    }
    public void DelFirst()
    {
        Node temp=head;
        head=getNode(0);
        temp.next=null;
    }
    public void DelLast()
    {
        Node Last=getNode(size-2);
        Last.next=null;
        tail=Last;
        size--;
    }
    public static void main(String args[]) {
        Main li=new Main(); // Corrected the class name
        li.addFirst(10);
        li.addFirst(20);
        li.addFirst(30);
        li.addFirst(40);
        li.display();
        li.addFirst(50);
        li.display();
        li.addAtk(45,1);
        li.display();
        System.out.println(li.getvalue(li.size-3));
        li.DelFirst();
        li.display();
        li.DelLast();
        li.display();
    }
}