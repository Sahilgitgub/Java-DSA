import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class implementing_stack_using_queue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        queue q=new queue();
        q.push(6);
        q.push(7);
        q.push(8);
        q.push(9);
        q.push(10);
        System.out.println(q.peek());
        System.out.println(q.pop());
    }
    public static class queue
    {
        Queue<Integer>q1=new ArrayDeque<>();
        public void push(int val)
        {
               q1.add(val);
            System.out.println(q1);
        }
        public int peek()
        {
            while(q1.size()>1)
            {
                q1.add(q1.remove());
            }
            int x=q1.peek();
            q1.add(q1.remove());
            return x;
        }
        public int  pop()
        {
            for(int i=0;i<q1.size()-1;i++)
            {
                q1.add(q1.remove());
            }
            int x=q1.peek();
            q1.remove(x);
            return x;
        }
    }
}
