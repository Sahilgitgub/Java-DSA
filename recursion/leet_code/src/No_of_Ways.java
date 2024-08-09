//class no_of_ways {
//    public static int ways(int arr[][], int r, int c, String ans) {
//        if (r == arr.length - 1 && c == arr[0].length - 1) {
//            System.out.println(ans);
//            return 1;
//        }
//        int a=0;
//        int b=0;
//        if (c < arr[0].length - 1) {
//            a=ways(arr, r, c + 1, ans + "H");
//
//        }
//        if (r < arr.length - 1) {
//             b=ways(arr, r + 1, c, ans + "V");
//        }
//        return a+b;
//    }
//
//    public static void main(String[] args) {
//        int r = 3;
//        int c = 3;
//        int arr[][] = new int[r][c];
//        System.out.println(ways(arr, 0, 0, ""));
//    }

     class no_of_ways {
        public static void m_ways(int arr[][],int col,int row,int ans,String anss)
        {
            if(col==2 && row==2)
            {
                ans=ans+arr[row][col];
                anss+=arr[row][col];
                System.out.println(anss);
                System.out.println(ans);
//                System.out.println("*******************************************************************");
                return;
            }
            if(col<arr[0].length-1)
            {
                m_ways(arr,col+1,row,ans+arr[row][col],anss+arr[row][col]);
            }
            if(row<arr.length-1)
            {
                m_ways(arr,col,row+1,ans+arr[row][col],anss+arr[row][col]);
            }
        }
        public static void main(String[] args) {
            int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
            m_ways(arr,0,0,0,"");

        }
    }
