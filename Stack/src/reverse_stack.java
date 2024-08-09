
import java.util.Scanner;
import java.util.Stack;

public class reverse_stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            st.push(sc.nextInt());
        }
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack<Integer> st)
    {
        if(st.isEmpty()) {
            return;
        }
        int k=st.pop();
        reverse(st);
        bottom(k,st);
    }
    public static void bottom(int k,Stack<Integer> st)
    {
        if(st.isEmpty())
        {
            st.push(k);
            return;
        }
        int data=st.pop();
        bottom(k,st);
        st.push(data);
    }
}