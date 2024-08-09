import java.sql.SQLOutput;
import java.util.Scanner;

public class fact {
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
//        base cases
        if(n<0)
        {
            return -1;
        }
        int fact=n*factorial(n-1);
        return fact;
    }
    public static void main(String s[])
    {
        Scanner  sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
}
