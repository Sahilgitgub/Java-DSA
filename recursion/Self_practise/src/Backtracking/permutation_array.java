package Backtracking;

import java.util.*;
public class permutation_array {
    public static void main(String args[]) {
        // Your Code Here
        int nums[]={1,2,3};
        // ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans);
        System.out.println(ans);
    }
    public static void helper(int nums[],int idx,ArrayList<ArrayList<Integer>>ans)
    {
        if(idx==nums.length-1)
        {
            ArrayList<Integer>l=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                l.add(nums[i]);
            }
            ans.add(l);
            return;
        }
        for(int i=idx;i<nums.length;i++)
        {
            swap(i,idx,nums);
            helper(nums,idx+1,ans);
            swap(i,idx,nums);
        }


    }
    public static void swap(int i,int idx,int nums[])
    {
        int temp=nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }
}
