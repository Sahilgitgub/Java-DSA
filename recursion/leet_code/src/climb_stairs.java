public class climb_stairs {
    public static int stairs(int n) {
        if(n==1 || n==2)
        {
//            System.out.println(ans);
            return n;
        }
//        if(n<0)
//        {
//            return;
//        }
        int a=stairs(n-1);
        int b=stairs(n-2);
        return a+b;
//        stairs(n-3,ans+"3");
//        for(int i=0;i<=n;i++)
//        {
//            stairs(n-i,ans+"i");
//        }
    }
    public static void main(String[] args) {
        int n=44;
        System.out.println(stairs(n));
    }
}
