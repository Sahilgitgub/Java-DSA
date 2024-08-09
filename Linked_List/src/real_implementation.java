public class real_implementation {
        public static class Node{
            int data;
            Node next;

            Node(int data)
            {
                this.data=data;
            }
        }

        public static class linked_list
        {
            Node head=null;
            Node tail=null;
            int size=0;

            void add_first(int data)
            {
                Node temp = new Node(data);
                if(head==null)
                {
                    head=temp;
                    tail=temp;
                }
                else{
                    temp.next=head;
                    head=temp;
                }
                size++;
            }

            void add_last(int data)
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
                size++;
            }

            void add_k_position(int idx,int data)
            {
                Node t=new Node(data);
                Node temp=head;
                if(idx==0)
                {
                    add_first(data);
                    return;
                }

                else if(idx==size)
                {
                    add_last(data);
                    return;
                }
                else if(idx<0 || idx>size)
                {
                    System.out.println("wrong index");
                    return;
                }
                else
                {
                    for(int i=0;i<idx-1;i++)
                    {
                        temp=temp.next;
                    }
                    t.next=temp.next;
                    temp.next=t;
                }
                size++;
            }

            void get_element(int idx)
            {
                Node temp=head;
                for(int i=0;i<idx;i++)
                {
                    temp=temp.next;
                }
                System.out.println("element  at "+" idx"+" "+idx+" = "+temp.data);
            }

            void delete(int idx)
            {
                if(idx==0)
                {
                    head=head.next;
                    size--;
                    return;
                }
                Node temp=head;
                for(int i=0;i<idx-1;i++)
                {
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                tail=temp;
                size--;

            }

            void remove_duplicates()
            {
                Node temp=head;
                while(temp!=null)
                {
                    if(temp.data==temp.next.data)
                    {
                        temp.next=temp.next.next;
                    }

                    else {
                        temp=temp.next;
                    }
                }
                    tail=temp;
                    tail.next=null;
            }

            void display()
            {
                Node temp=head;
                while(temp!=null)
                {
                    System.out.print(temp.data+"->");
                    temp=temp.next;
                }
            }
            // int  size()
            // {
            //     Node temp=head;
            //     int size=0;
            //     while(temp!=null)
            //     {
            //         size++;
            //         temp=temp.next;
            //     }
            //     return size;
            // }
        }
        public static void main(String[] args) {
            linked_list ll =new linked_list();
            ll.add_first(5);
            ll.add_first(5);
            ll.add_first(15);
            ll.add_last(6);
            ll.add_last(90);
            ll.add_k_position(0,55);
            ll.get_element(3);
            System.out.println("size:"+ll.size);
            ll.display();
            System.out.println();
            ll.delete(0);
            ll.display();
            System.out.println();
            System.out.println("size:"+ll.size);
            System.out.println("head:"+ll.head.data);
            System.out.println("tail:"+ll.tail.data);
            ll.display();
            ll.remove_duplicates();
            ll.display();
        }
    }
