import java.util.*;
public class merge_and_sort {
    public static void main(String[] args) {
        int[] left = {1,3,5,7,9};
        int[] right = {2,5};
        int[] ans = merge(left,right);
        System.out.println(Arrays.toString(ans));
    }
    static int[] merge(int[] l, int[] r){
        int ans[] = new int[l.length+r.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<l.length && j<r.length){
            if(l[i] < r[j]){
                ans[k] = l[i];
                i++;
                k++;
            }else{
                ans[k] = r[j];
                j++;
                k++;
            }
        }
        while(i<l.length){
            ans[k] = l[i];
            i++;
            k++;
        }
        while(j<r.length){
            ans[k] = r[j];
            j++;
            k++;
        }
        return ans;
    }
}