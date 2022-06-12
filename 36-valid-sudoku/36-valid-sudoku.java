class Solution {
    public boolean isValidSudoku(char[][] board) {
        return checkSudoku(board, 0, 0);
    }
    
    public boolean checkSudoku(char[][] grid, int row, int col){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] != '.' && !isValid(grid, grid[i][j], i, j)){
                    return false;
                }
            }
        }
        return true;
        
//         if(col == grid.length){
//             col = 0;
//             row++;
//         }
        
//         if(row == grid.length){
//             return true;
//         }
        
//         char temp = grid[row][col];
        
//         if(temp != '.' && !isValid(grid, temp, row, col)){
//             return false;
//         }
        
//         return checkSudoku(grid, row, col+1);
    }
    
    public static boolean isValid(char[][] grid, char n, int r, int c){
        // row check
        for (int i = 0; i < grid.length; i++) {
            if (i != r && grid[i][c] == n) {
                return false;
            }
        }

        // col check
        for (int i = 0; i < grid.length; i++) {
            if(i != c && grid[r][i] == n){
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
                if(i != r && j != c && grid[i][j] == n){
                    return false;
                }
            }
        }

        return true;
    }
}