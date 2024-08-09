import java.util.Scanner;

public class palindrome_string {
    public static String pldr(String s1) {
        if(s1.length()==0)
            return "";
        String smallans=pldr(s1.substring(1));
        char curr=s1.charAt(0);
        return curr+smallans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.next();
        String rev=pldr(s1);

        if(rev.equals(s1))
        {
            System.out.println("It is a palindrome string");
        }
        else {
            System.out.println("It is not a palindrome string");
        }
    }
}
