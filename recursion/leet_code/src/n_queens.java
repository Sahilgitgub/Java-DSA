class n_Queens {
    public static void main(String[] args) {
        int tq=4;
        int [][] arr=new int[tq][tq];
        print(arr,tq,0);
    }
    public static void print(int[][] arr,int tq,int row){
        for(int col=0;col<arr[0].length;col++){
            if(row==arr.length){
                display(arr);
                System.out.println("---------");
                return;
            }
            if(tq==0){
                return;
            }
        }

        for(int col=0;col<arr[0].length;col++){
            if(isvalid(arr,row,col)){
                arr[row][col]=1;
                print(arr,tq-1,row+1);
                arr[row][col]=0;
            }
        }

    }
    public static boolean isvalid(int[][] arr,int row,int col){
        int r=row;
        int c=col;

        //for row
        while(r>=0){
            if(arr[r][col]==1){
                return false;
            }
            r--;
        }

        //for right diagoals
        r=row;
        c=col;
        while(r>=0 && c<arr[0].length){
            if(arr[r][c]==1){
                return false;
            }
            r--;
            c++;
        }
        //for left diagoals
        r=row;
        c=col;
        while(r>=0 && c>=0){
            if(arr[r][c]==1){
                return false;
            }
            r--;
            c--;
        }

        return true;

    }

    private static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}