import java.util.Scanner;

public class alternate_sign {
    public static int  alt_sign(int n)
    {
        if(n==0)
            return 0;
        if(n%2==0)
        {
            return alt_sign(n-1)-n;
        }
        return alt_sign(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(alt_sign(n));
    }
}
