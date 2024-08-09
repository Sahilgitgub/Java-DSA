import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int arr[]={4,6,2,8,1,9,3};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quick(int arr[],int si,int ei)
    {
        if(si>ei)
        {
            return;
        }
        int pi=partition(arr,si,ei);
        quick(arr,si,pi-1);
        quick(arr,pi+1,ei);
    }
    public static int partition(int arr[],int si,int ei)
    {
        int pivot=arr[ei];
        int pi=si;
        for(int i=si;i<ei;i++)
        {
            if(arr[i]<pivot)
            {
                int temp=arr[i];
                arr[i]=arr[pi];
                arr[pi]=temp;
                pi++;
            }
        }
        int temp=arr[ei];
        arr[ei]=arr[pi];
        arr[pi]=temp;

        return pi;
    }
}
