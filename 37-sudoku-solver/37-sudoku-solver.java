class Solution {
    
    public void solveSudoku(char[][] grid) {
        sudoku(grid, 0, 0);
    }
        
    public static boolean sudoku(char[][] grid, int row, int col){
       
        // get 1st empty cell
        // if no empty cell then solution is found
        if(col == grid.length){
            col = 0;
            row++;
        }

        if(row == grid.length){
            return true;
        }

        if(grid[row][col] != '.'){
            return sudoku(grid, row, col+1);  
        }

        //check and place 1 to 9 using for loop
        // then call again using updated grid
        for (int i = 1; i < 10; i++) {
            char c = (char)(i+'0');
            if(isValid(grid, c, row, col)){
                grid[row][col] = c;
                                
                if(sudoku(grid, row, col+1)){
                    return true;
                } else {
                    grid[row][col] = '.';
                }
            }
        }
        return false;
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
}