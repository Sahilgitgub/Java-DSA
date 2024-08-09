import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        distinct(arr);
    }

    public static void distinct(int arr[]) {
        ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = i + 1; j <= arr.length ; j++) {
                if (arr[i] != arr[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }

}

    //User function Template for Java


    // function should return the count of
// distinct integers in the given
// arraylist.
//public class Main{
//    public static int countDistinct(ArrayList<Integer> numbers){
//        int count = 1;
//        Collections.sort(numbers);
//        for(int i = 0; i < numbers.size()-1; i++)
//        {
//            if(numbers.get(i) != numbers.get(i+1))
//            {
//                // System.out.print(numbers.get(i) + " ");
//                count++;
//            }
//        }
//        return count;
//        // 4 4 5 4 3 8 4 2 4 8 1 7
//        // 1 2 3 4 4 4 4 4 5 7 8 8
//    }
//
//    }