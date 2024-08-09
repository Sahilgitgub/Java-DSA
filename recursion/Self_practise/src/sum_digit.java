public class sum_digit {
    public static int sum(int arr[],int idx){
        if(idx==0)
        {
            return 0;
        }
        if(idx==1) {
            return arr[0];
        }
        int remaingpart=sum(arr,idx-1);
        int sum=arr[idx-1]+remaingpart;
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,5};
        System.out.println(sum(arr,arr.length));
    }
}
