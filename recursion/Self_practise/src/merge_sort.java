//public class merge_sort {
//    public static void conquer(int arr[],int start_idx,int mid,int end_index)
//    {
//        int merged[]=new int[start_idx+end_index];
//        int idx1=start_idx;
//        int idx2=mid+1;
//        int x=0;
//        while (idx1<=mid && idx2<=end_index)
//        {
//            if(arr[idx1]<=arr[idx2])
//            {
//                merged[x]=arr[idx1];
//                x++;
//                idx1++;
//            }
//            else {
//                merged[x]=arr[idx2];
//                x++;
//                idx2++;
//            }
//            while(idx1<=mid)
//            {
//                merged[x]=arr[idx1];
//                x++;
//                idx1++;
//            }
//            while(idx2<=end_index)
//            {
//                merged[x]=merged[idx2];
//                x++;
//                idx1++;
//            }
//        }
//    }
//    public static void divide(int arr[],int start_idx,int end_idx) {
//        if(start_idx>=end_idx)
//        {
//            return;
//        }
//        int mid=(start_idx+(end_idx-start_idx))/2;
//        divide(arr,start_idx,mid);
//        divide(arr,mid+1,end_idx);
//        conquer(arr,start_idx,mid,end_idx);
//    }
//    public static void main(String[] args) {
//        int arr[]={3,2,5,6,4,3,2,1};
////        int start_idx=0;
//        int n=arr.length;
//        divide(arr,0,n-1);
//        for (int i=0;i<arr.length-1;i++)
//        {
//            System.out.println(arr[i]);
//        }
//    }
//}


import java.lang.reflect.Array;
import java.util.Arrays;

public class merge_sort {
    public static void conquer(int arr[], int start_idx, int mid, int end_index) {
        int merged[] = new int[end_index -start_idx+ 1];
        int idx1 = start_idx;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= end_index) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }

        while (idx1 <= mid) {
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }

        while (idx2 <= end_index) {
            merged[x] = arr[idx2];
            x++;
            idx2++;
        }

        for (int i = 0; i < merged.length; i++) {
            arr[start_idx + i] = merged[i];
        }
    }

    public static void divide(int arr[], int start_idx, int end_idx) {
        if (start_idx >= end_idx) {
            return;
        }
        int mid = (start_idx + end_idx) / 2;
        divide(arr, start_idx, mid);
        divide(arr, mid + 1, end_idx);
        conquer(arr, start_idx, mid, end_idx);
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 5, 6, 4, 3, 2, 1};
        int n = arr.length;
        divide(arr, 0, n - 1);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
            System.out.println(Arrays.toString(arr));
    }
}
