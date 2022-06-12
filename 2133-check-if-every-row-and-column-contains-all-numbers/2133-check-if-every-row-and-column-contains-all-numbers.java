class Solution {
    public boolean checkValid(int[][] matrix) {
        int i = 0;
        int len = matrix.length;
        while(i < len){
            for(int number = 1; number <= len; number++){
                if(!checkNumbers(matrix, i, number)){
                    return false;
                }
            }
            i++;
        }
        
        return true;
    }
    
    public boolean checkNumbers(int[][] matrix, int index, int n){      
                
        boolean validRow = false;
        boolean validCol = false;
        
        for(int j = 0; j < matrix.length; j++){
            if(matrix[index][j] == n){
                validRow = true;
            }
        }

        for(int k = 0; k < matrix.length; k++){
            if(matrix[k][index] == n){
                validCol = true;
            }
        }
        
        return validRow && validCol;
    }
}