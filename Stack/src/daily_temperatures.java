import java.util.Stack;

public class daily_temperatures {
    public static void main(String[] args) {
        int arr[]={73,74,75,71,69,72,76,73};
        int res[]=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(st.size()>0 && arr[st.peek()] < arr[i])
            {
                int k=st.pop();
                res[k]=i-k;
            }
            st.push(i);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
