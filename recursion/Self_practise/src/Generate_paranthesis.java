import java.util.*;
public class Generate_paranthesis {
    public static void paranthesis(int n,int open,int close,String ans)
    {
        if(open==n && close==n)
        {
            System.out.println(ans);
            return;
        }
        // check the order of the calls accordingly.
        if(close<open)
            paranthesis(n,open,close+1,ans+")");
        if(open<n)
            paranthesis(n,open+1,close,ans+"(");
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        paranthesis(n,0,0,"");
    }
}