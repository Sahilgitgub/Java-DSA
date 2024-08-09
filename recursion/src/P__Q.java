import java.util.Scanner;

public class P__Q {
    public static int pow(int p,int q) {
        //base case
        if(q==0)
            return 1;
//        recursive work
        return pow(p,q-1)*p;
    }
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.println(pow(p,q));
    }
}
