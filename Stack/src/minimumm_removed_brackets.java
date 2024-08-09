import java.util.Scanner;
import java.util.Stack;

public class minimumm_removed_brackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                st.push(ch);
//                count++;
            }
            else {
                if(st.size()==0)
                {
                    return;
                }
                if(st.peek()=='(')
                {
                    st.pop();
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
