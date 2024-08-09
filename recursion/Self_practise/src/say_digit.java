public class say_digit {
    public static void s_d(String arr[],int n){
        if(n==0)
            return;
        int digit=n%10;
        n=n/10;
        s_d(arr,n);
        System.out.print(" "+arr[digit]);

    }
    public static void main(String[] args) {
        String arr[]={"Zero","one","two","three","four","five","six","seven","eight","nine"};
        int n=120;
        s_d(arr,n);
    }
}
