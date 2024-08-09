import java.util.Scanner;

//public class sum_of_digits {
//    public static int sod(int n)
//    {
//        if(n>=0 && n<=9)
//            return n;
//        return sod(n/10)+sod(n%10);
//    }
//    public static void main(String s[])
//    {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(sod(n));
//    }
//}



public class  sum_of_digits {
    public static int sod(int n)
    {
        if(n>=0 && n<=9)
        {
            return 1;
        }
        return sod(n/10)+1;

    }
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sod(n));
    }
}
