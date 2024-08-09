import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reverse_k_elements {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        Stack<Integer>st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            q.add(sc.nextInt());
        }
        int k=sc.nextInt();
        for(int i=0;i<k;i++)
        {

                int x=q.remove();
                st.push(x);

        }
        for(int i=0;i<k;i++) {
            int b = st.pop();
            q.add(b);
        }
        System.out.println(q);
        for(int i=0;i<n-k;i++)
        {
            int y=q.remove();
            q.add(y);
        }
        System.out.println(q);
    }
}
