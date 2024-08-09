public class Main {
    public static void print(boolean board[],int q,String ans,int qp) {
        if(qp==q)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<board.length;i++)
        {
            if(board[i]!=true)
            {
                board[i]=true;
                print(board,q,ans+"B"+i+"Q"+qp,qp+1);
                board[i]=false;
            }
        }
    }
    public static void main(String[] args) {
        boolean board[]=new boolean[4];
        int q=2;
        print(board,q,"",0);
    }
}