import java.util.Scanner;
import java.util.Stack;

public  class remove_bottom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            st.push(sc.nextInt());
        }
//        System.out.println(st);
        int idx=sc.nextInt();
        Stack<Integer> temp=new Stack<>();
        while(st.size()>idx)
        {
            temp.push(st.pop());
        }
        st.pop();
        while(temp.size()>0)
        {
            st.push(temp.pop());
        }
        System.out.println(st);
    }

}