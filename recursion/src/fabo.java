import java.util.Scanner;
//To print any number in fabonacci series.
public class fabo {
    public static int fab(int n)
    {
//        base case
            if(n==0 || n==1)
            {
                return n;
            }
            int prev=fab(n-1);
            int Prev_Prev=fab(n-2);
            return prev+Prev_Prev;
    }
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fab(n));
    }
}
