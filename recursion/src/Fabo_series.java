import java.util.Scanner;

public class Fabo_series {
    public static int fs(int n)
    {
        // how to print  fabnacci series
        if(n==0 || n==1)
            return n;
        int prev=fs(n-1);
        int prev_prev=fs(n-2);
        return prev+prev_prev;
    }
    public static void main(String s[])
    {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println(fs(i));
        }
    }
}
