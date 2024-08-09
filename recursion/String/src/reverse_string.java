import java.util.Scanner;

public class reverse_string {
    public static String rev_str(String s1,int idx) {
        if(s1.length()==idx)
            return "";
        String smallans=rev_str(s1,idx+1);
        char curr=s1.charAt(idx);
        return smallans+curr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println(rev_str(s1,0));
    }
}
