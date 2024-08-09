package Backtracking;//ake an input N, a number. Take N more inputs and store that in an array. Take an input target, a number
//
//        a. Write a recursive function which prints subsets of the array which sum to target.
//
//        b. Write a recursive function which counts the number of subsets of the array which sum to target. Print the value returned.
//
//        Input Format
//        Take an input N, a number. Take N more inputs and store that in an array. Take an input target, a number
//
//        Constraints
//        None
//
//        Output Format
//        Display the number of subsets and print the subsets in a space separated manner.


//Sample Input
//        3
//        1
//        2
//        3
//        3
//        Sample Output
//        1 2  3
//        2
//        Explanation
//        Add 2 spaces between 2 subset solutions


import java.util.*;
public class arraylist_subset {
    static int count=0;
    public static void subset(int arr[],int index,int sum,ArrayList<Integer>list,int target)
    {
        if(sum==target)
        {
            for(int i=0;i<list.size();i++)
            {
                System.out.print(list.get(i)+" ");
            }
            count++;
            return;
        }
        if(index==arr.length)
        {
            return;
        }

        list.add(arr[index]);
        subset(arr,index+1,sum+arr[index],list,target);

        list.remove(list.size()-1);
        subset(arr,index+1,sum,list,target);
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the elements: ");
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("Enter value to sum: ");
        int target=sc.nextInt();
        subset(arr,0,0,list,target);
        System.out.println("\n"+count);
    }
}
