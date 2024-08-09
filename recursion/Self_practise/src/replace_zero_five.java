public class replace_zero_five
{
    public static int replace(int n)
    {
        if(n==0)
        {
            return 5;
        }
        int digit=n%10;
        if(digit==0)
            digit=5;
        n/=10;
        replace(n);
        return digit;
    }
    public static void main(String[] args) {
        int n=103;
        System.out.println(replace(n));
    }
}
