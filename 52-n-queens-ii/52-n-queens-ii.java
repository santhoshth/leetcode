class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];

        int c = queensCount(board, 0, 0);

        return c;
    }
    
    public int queensCount(boolean[][] board, int row, int count){
        if(row == board.length){
            count = count + 1;
            return count;
        }

        for (int col = 0; col < board.length; col++) {
            if(check(board, row, col)){
                board[row][col] = true;
                count = queensCount(board, row + 1, count);
                board[row][col] = false;
            }
        }

        return count;
    }

    public static boolean check(boolean[][] board, int row, int col) {
        return checkStraight(board, row, col) && checkLeft(board, row, col) && checkRight(board, row, col);
    }

    public static boolean checkStraight(boolean[][] board, int row, int col) {
        while(row >= 0){
            if(board[row][col]){
                return false;
            }
            row--;
        }
        return true;
    }

    public static boolean checkLeft(boolean[][] board, int row, int col) {
        while(row >= 0 && col >= 0){
            if(board[row][col]){
                return false;
            }
            row--;
            col--;
        }
        return true;
    }

    public static boolean checkRight(boolean[][] board, int row, int col) {
        while(row >= 0 && col < board.length){
            if(board[row][col]){
                return false;
            }
            row--;
            col++;
        }
        return true;
    }
}