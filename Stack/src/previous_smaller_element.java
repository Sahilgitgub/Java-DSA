import java.util.Stack;

public class previous_smaller_element {
    public static void main(String[] args) {
        int arr[]={5,2,4,6,3,5};
        int res[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        res[0]=-1;
        for(int i=0;i<arr.length;i++)
        {
            while(st.size()>0 && st.peek()>arr[i])
            {
                st.pop();
            }
            if(st.size()==0)
            {
                res[i]=-1;
            }
            else {
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(res[i]+" ");
        }

    }
}
