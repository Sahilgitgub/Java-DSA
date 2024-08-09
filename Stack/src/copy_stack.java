import java.util.Scanner;
import java.util.Stack;

public class copy_stack {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            st.push(sc.nextInt());
        }
        System.out.println(st);
//        reverse order
        Stack <Integer> rt=new Stack<>();
        while(st.size()>0) {
//            int x = st.peek();
//            rt.push(x);
//            st.pop();
//            another way
            rt.push(st.pop());
        }
        System.out.println("reverse order: "+rt);

//      now copy the content of rt into new stack so that it became the copy
        Stack<Integer> gt=new Stack<>();
        while(rt.size()>0)
        {
            gt.push(rt.pop());
        }
        System.out.println("copy of the stack: "+gt);
    }
}
