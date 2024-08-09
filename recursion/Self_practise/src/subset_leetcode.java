import java.util.ArrayList;
import java.util.Collections;

public class subset_leetcode {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        ArrayList<Integer> l= new ArrayList<>();
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        subset(arr,0,l,ans);

        System.out.println(ans);
    }

    public static void subset(int arr[],int idx,ArrayList<Integer>l,ArrayList<ArrayList<Integer>>ans) {
        if (idx == arr.length)
        {
            ans.add(new ArrayList<>(l));
//            Collections.sort(ans);
            return;
        }
//        for(int i=idx;i<arr.length;i++)
//        {
            l.add(arr[idx]);
            subset(arr,idx+1,l,ans);
            l.remove(l.size()-1);
            subset(arr,idx+1,l,ans);
//        }
    }
}
