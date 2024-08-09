import java.util.Scanner;

public class Digital_Roots {
    public static int dgtl_r(int n)
    {
        if(n<10)
        {
            return n;
        }
        int sum=0;
        while(n>0)
        {

           int a=n%10;
            sum+=a;
            n/=10;
        }
       return dgtl_r(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(dgtl_r(n));
    }
}
