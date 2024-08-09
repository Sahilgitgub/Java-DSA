import java.util.*;
public class stack {
    int[]st;
    public stack(){
        st=new int[10];
    }
    public stack(int val){
        st=new int[val];
    }
    int tos=-1;
    public void push(int val){
        st[tos+1]=val;
        tos++;
    }
    public int pop() throws Exception {
        tos--;
        if(tos==-2)throw new Exception("Index Out Of Bound");
        int temp=st[tos+1];
        st[tos+1]=0;
        return temp;
    }
    public int peek() throws Exception{
        tos--;
        if(tos==-2)throw new Exception("Index Out Of Bound");
        return st[tos+1];
    }
    public int size(){
        return tos+1;
    }


    public static void main(String[] args) throws Exception {
        stack st=new stack();
        st.push(5);
        st.push(10);
        System.out.println(st.size());
    }
}