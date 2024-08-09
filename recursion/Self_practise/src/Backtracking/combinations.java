package Backtracking;

import java.util.ArrayList;
import java.util.List;
public class combinations {
    public static void main(String[] args) {
// 		int arr[]={1,2,3};
        int n=4;
        List<Integer> l=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        subset(1,n,l,ans,3);
// 		if(ans.size()==2)
        System.out.println(ans);
    }
    public static void subset(int start,int n,List<Integer> l,List<List<Integer>> ans,int k)
    {
        if(l.size()==k)
        {
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=start;i<=n;i++)
        {
            l.add(i);

            subset(i+1,n,l,ans,k);
            l.remove(l.size()-1);
        }
    }
}