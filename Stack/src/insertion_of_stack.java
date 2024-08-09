import java.util.Stack;

public class insertion_of_stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
//        System.out.println(st);
        int idx=0;
        int x=17;
     Stack<Integer> temp=new Stack<>();
     while(st.size()>idx)
     {
         temp.push(st.pop());
     }
     st.push(x);
     while(temp.size()>0)
     {
         st.push(temp.pop());
     }
        System.out.println(st);
    }
}
