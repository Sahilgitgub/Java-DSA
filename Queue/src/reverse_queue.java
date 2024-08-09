import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.TransferQueue;

public class reverse_queue {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        Stack<Integer> st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            q.add(sc.nextInt());
        }
        while(q.size()>0)
        {
            st.push(q.remove());
        }
        while(st.size()>0)
        {
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
