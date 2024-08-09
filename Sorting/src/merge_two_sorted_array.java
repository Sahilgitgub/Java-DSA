import java.util.*;
public class merge_two_sorted_array {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={5,6,7,8};
        int n=arr1.length;
        int m=arr2.length;
        int merged[]=new int[n+m];
        int x=0;
        for(int i=0;i<arr1.length;i++)
        {
            merged[x]=arr1[i];
            x++;
        }
        for(int i=0;i<arr2.length;i++)
        {
            merged[x]=arr2[i];
            x++;
        }
        for(int i=0;i<n+m;i++)
        {
            System.out.println(merged[i]);
        }
        System.out.println(Arrays.toString(merged));
    }
}
