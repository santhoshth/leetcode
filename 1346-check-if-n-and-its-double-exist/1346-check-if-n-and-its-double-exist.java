class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                int x = arr[i];
                int y = arr[j];
                if(x == 2 * y || y == 2 * x){
                    return true;
                }
            }
        }
        
        return false;
    }
}