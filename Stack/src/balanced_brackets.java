import java.util.Scanner;
import java.util.Stack;

public class balanced_brackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isbalanced(s));
    }

    public  static boolean isbalanced(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                st.push(ch);
            }
            else {
                if(st.size()==0)
                {
                    return false;
                }
                if(st.peek()=='(')
                {
                    st.pop();
                }
            }
        }
        if(st.size()>0)
            return false;
        else {
            return true;
        }
    }
}
