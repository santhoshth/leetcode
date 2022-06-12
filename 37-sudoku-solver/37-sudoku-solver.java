class Solution {
    public void solveSudoku(char[][] grid) {
        // get 1st empty cell
        // if no empty cell then solution is found
        int[] cell = emptyCell(grid);
        int row = cell[0];
        int col = cell[1];
        if(row == -1 && col == -1){
            return;
        }

        //check and place 1 to 9 using for loop
        // then call again using updated grid
        for (int i = 1; i < 10; i++) {
            String c = i+"";
            if(isValid(grid, c.charAt(0), row, col)){
                grid[row][col] = c.charAt(0);
                solveSudoku(grid);
                if(isEmpty(grid)){
                   return; 
                }else {                    
                grid[row][col] = '.';
                }
            }
        } 
    }
        
    public static boolean isValid(char[][] grid, char n, int r, int c){
        // row check
        for (char[] row : grid) {
            if (row[c] == n) {
                return false;
            }
        }

        // col check
        for (int i = 0; i < grid.length; i++) {
            if(grid[r][i] == n){
                return false;
            }
        }

        // sub matrix
        int rowStart = r - r%3;
        int rowEnd = rowStart+3;
        int colStart = c - c%3;
        int colEnd = colStart+3;
        for (int i = rowStart; i < rowEnd; i++) {
            for (int j = colStart; j < colEnd; j++) {
                if(grid[i][j] == n){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] emptyCell(char[][] grid){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '.'){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    
    public static boolean isEmpty(char[][] grid){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '.'){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void display(char[][] grid){
        for (char[] row : grid) {
            System.out.println(Arrays.toString(row));
        }
    }
}