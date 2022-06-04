class Solution {
    public List<List<String>> solveNQueens(int n) {
        StringBuilder s = new StringBuilder();
        for (int j = 0; j < n; j++) {
            s.append(".");
        }

        List<List<String>> res = new ArrayList<>();

        List<String> board = new ArrayList<>();

        for(int j = 0; j < n; j++){
            board.add(s.toString());
        }

        queens(res, board, 0);

        // System.out.println(res);
        return res;
    }

    public void queens(List<List<String>> result, List<String> board, int row){
        if(row == board.size()){
            List<String> ans = new ArrayList<>(board);
            result.add(ans);
            return;
        }

        StringBuilder temp = new StringBuilder(board.get(row));

        for(int col = 0; col < board.size(); col++){
            if(allCheck(board, row, col)) {
                temp.setCharAt(col, 'Q');
                board.set(row, temp.toString());
                queens(result, board, row + 1);
                temp.setCharAt(col, '.');
                board.set(row, temp.toString());
            }
        }
    }


    public boolean allCheck(List<String> board, int row, int col){
        return checkStraight(board, row, col) && checkLeft(board, row, col) && checkRight(board, row, col);
    }

    public boolean checkStraight(List<String> board, int row, int col){
        while(row >= 0){
            if(board.get(row).charAt(col) == 'Q'){
                return false;
            }
            row--;
        }
        return true;
    }

    public boolean checkLeft(List<String> board, int row, int col){
        while(row >= 0 && col >= 0){
            if(board.get(row).charAt(col) == 'Q'){
                return false;
            }
            row--;
            col--;
        }
        return true;
    }

    public boolean checkRight(List<String> board, int row, int col){
        while(row >= 0 && col < board.size()){
            if(board.get(row).charAt(col) == 'Q'){
                return false;
            }
            row--;
            col++;
        }
        return true;
    }
}