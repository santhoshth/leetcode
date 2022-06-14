class Solution {
    public boolean judgeSquareSum(int c) {       
        
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b)
                return true;
        }
        return false;
    
        
//         for(int i = 0; i <= c; i++){
//             if(recursion(i, c-i))
//                 return true;
//         }
        
//         return false;
    }
    
    public boolean recursion(int a, int b){
        return (checkSquare(a) && checkSquare(b));
    }
    
    public boolean checkSquare(int n){
        int start = 0;
        int end = n;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            int square = mid * mid;
            if(square == n){
                return true;
            }
            
            if(square > n){
                end = mid - 1;
            }else{
                start = mid +1;
            }
        }
        return false;
    }
}