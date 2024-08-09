//public class Lexo_GRaphical {
//    public static void lexo(int n,int ans) {
//        if(ans<=n)
//        {
//            if(ans!=0)
//                System.out.println(ans);
////            return;
//        }
//        if(ans>n)
//        {
//            return;
//        }
////        int i=0;
////        if(ans==0)
////        {
////            i=1;
////        }
//        for(int i=1;i<=9;i++)
//        {
//            lexo(n,ans*10+i);
//        }
//
//    }
//    public static void main(String[] args) {
//          int n=10;
//          lexo(n,0);
//    }
//}
//******************************************************OR**************************************************************************************


public class Lexo_GRaphical {
    public static void lexo(int n,int ans) {
        if(ans<=n)
        {
            System.out.println(ans);
//           return;
        }
        if(ans>n)
        {
            return;
        }
        for(int i=0;i<=9;i++)
        {
            lexo(n,ans*10+i);
        }

    }
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=9;i++)
        {
            lexo(n,i);
        }

    }
}
