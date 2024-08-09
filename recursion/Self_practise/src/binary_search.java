public class binary_search {
//    applicable only in sorted array..
    public static int binary(int arr[], int s, int end, int target) {
        if (s > end)
            return -1; // Target not found

        int mid = s + (end - s) / 2;

        if (arr[mid] == target)
            return mid;

        else if (arr[mid] < target) {
            return binary(arr, mid + 1, end, target);
        } else {
            return binary(arr, s, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 3, 4, 9};
        int s = 0;
        int end = arr.length - 1; // Adjusted to use the correct index
        int target = 4;

        int result = binary(arr, s, end, target);

        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
