public class Greatest_element {
//this is greatest elemnt to the right
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1, 8, 6, 3, 4};
        int res[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    res[i] = arr[j];
                    break;
                }
            }
        }

        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Greatest elements to the right:");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
