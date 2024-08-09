public class bubble_sort {
    public static void b_sort(int arr[],int i) {
        if(i>=arr.length-1)
            return;
        if(arr[i]>arr[i+1])
        {
            swap(arr,i);
        }
        b_sort(arr,i+1);
    }

    public static void swap(int arr[],int i) {
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
    public static void main(String[] args) {
        int arr[]={3};
        for(int i=0;i<arr.length;i++)
        {
            b_sort(arr,0);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}


//public class bubble_sort {
//    public static void b_sort(int arr[], int i) {
//        if (i >= arr.length - 1)
//            return;
//
//        if (arr[i] > arr[i + 1]) {
//            swap(arr, i);
//        }
//        b_sort(arr, i + 1);
//    }
//
//    public static void swap(int arr[], int i) {
//        int temp = arr[i];
//        arr[i] = arr[i + 1];
//        arr[i + 1] = temp;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = { 3, 5, 4, 2 };
//        for (int i = 0; i < arr.length - 1; i++) {
//            b_sort(arr, 0);
//        }
//
//        // Printing the sorted array
//        for (int value : arr) {
//            System.out.print(value + " ");
//        }
//    }
//}
