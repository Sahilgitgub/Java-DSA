public class permutation_repeate {
    static int count=0;
    public static void main(String[] args) {
        int arr[]={2,2,3};
        helper(arr,0);
        System.out.println("\n"+count);
    }

    public static void helper(int arr[],int idx) {
        if(idx==arr.length-1)
        {
            printarray(arr);
            count++;
            return;
        }
        for(int i=idx;i<arr.length;i++)
        {
            swap(i,idx,arr);
            helper(arr,idx+1);
            swap(i,idx,arr);
        }
    }

    public static void swap(int i,int idx,int arr[]) {
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
    }

    public static void printarray(int arr[]) {

            System.out.println("");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
