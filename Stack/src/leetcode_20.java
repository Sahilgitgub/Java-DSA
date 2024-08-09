//import java.util.Scanner;
//import java.util.Stack;
//
//public class leetcode_20 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.print(isvalid(s));
//    }
//
//    private static boolean isvalid(String s) {
//        Stack<Character> st = new Stack<>();
//        for(int i=0;i<s.length();i++)
//        {
//            char ch=s.charAt(i);
//            if(ch=='(' || ch=='[' || ch=='}')
//            {
//                st.push(ch);
//            }
//            else {
//                if(st.size()==0)
//                {
//                    return false;
//                }
//                char top = st.pop();
//                if ((ch == ')' && top != '(') ||
//                        (ch == ']' && top != '[') ||
//                        (ch == '}' && top != '{')) {
//                    return false;
//                }
//            }
//        }
//        if(st.size()>0)
//        return true;
//        else
//            return false;
//    }
//
//    }


import java.util.Scanner;
import java.util.Stack;

public class leetcode_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isValid = isValidParentheses(s);
        System.out.println(isValid);
    }

    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.size()==0) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
