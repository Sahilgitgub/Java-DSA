//public class permutation_backtrack{
//
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 3};
//        generatePermutations(nums, 0);
//    }
//
//    // Function to generate permutations
//    public static void generatePermutations(int[] nums, int index) {
//        if (index == nums.length - 1) {
//            // Base case: If we've reached the end of the array, print the permutation
//            System.out.println(Arrays.toString(nums));
//            return;
//        }
//
//        // Recursive case: Generate permutations for the remaining elements
//        for (int i = index; i < nums.length; i++) {
//            // Swap the current element with the element at index
//            swap(nums, index, i);
//
//            // Recursively generate permutations for the remaining elements
//            generatePermutations(nums, index + 1);
//
//            // Undo the swap to backtrack and explore other possibilities
//            swap(nums, index, i);
//        }
//    }
//
//    // Function to swap two elements in an array
//    public static void swap(int[] nums, int i, int j) {
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j]=temp;
//}
//}