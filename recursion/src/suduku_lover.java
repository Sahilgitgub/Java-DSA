public class suduku_lover{
    public static void main(String[] args) {

        int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        display(grid);
        System.out.println("------------------");
        solver(grid, 0, 0);
    }

    private static void solver(int[][] grid, int row, int col) {
        // TODO Auto-generated method stub

        if(col == 9){
            col = 0;
            row+=1;
        }
        if(row == 9){
            display(grid);
            return;
        }
        if (grid[row][col] != 0) {
            solver(grid, row, col + 1);
        } else {
            for (int i = 1; i <=9; i++) {
                if (isvalid(grid, row, col, i)) {
                    grid[row][col] = i;
                    solver(grid, row, col + 1);
                    grid[row][col] = 0;
                }
            }

        }

    }

    private static boolean isvalid(int[][] grid, int row, int col, int val) {

        int r = row;
        int c = col;

        // for row

        for (int i = 0; i < grid.length; i++) {
            if (grid[i][c] == val) {
                return false;
            }
        }

        // for col
        for (int i = 0; i < grid[0].length; i++) {
            if (grid[r][i] == val) {
                return false;
            }

        }

        // for 3*3 metrix
        //find start indecies
        r = r-r%3;
        c = c-c%3;
        for(int i=r; i<r+3; i++){
            for(int j = c; j<c+3; j++){
                if(grid[i][j] == val){
                    return false;
                }
            }
        }
        return true;
    }

    public static void display(int[][] grid){
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }

}