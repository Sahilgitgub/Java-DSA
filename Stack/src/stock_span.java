import java.util.Stack;

public class stock_span {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int price[] = {100,80,60,70,60,75,85};
        int n=price.length;
        int res[]=new int[n];
         for(int i=0;i<n;i++)
         {
             while(st.size()>0 && price[st.peek()]<=price[i]) {
                 st.pop();
             }
             if(st.size()==0)
             {
                 res[i]=i+1;
             }
             else {
                 res[i]=i-st.peek();
             }
             st.push(i);
         }
         for(int i:res)
         {
             System.out.print(i+" ");
         }
    }
}
