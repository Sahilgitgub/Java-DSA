import java.util.ArrayList;
//permutations
public class subset {
    public static void main(String[] args) {
        int[]arr={1,4,5,6};
        ArrayList<ArrayList<Integer>>ls=new ArrayList<>();
        ArrayList<Integer> ls1=new ArrayList<>();

        solve(arr,0,ls,ls1);
        System.out.println(ls);
    }
    public static void solve(int[]arr,int i,ArrayList<ArrayList<Integer>>ls,ArrayList<Integer>ls1){
        if(i>=arr.length){
            ls.add(new ArrayList<Integer>(ls1));
            return;
        }
        ls1.add(arr[i]);
        solve(arr,i+1,ls,ls1);
        ls1.remove(ls1.size()-1);
        solve(arr,i+1,ls,ls1);
    }
}