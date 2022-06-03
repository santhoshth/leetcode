class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int len = letters.length;
        int start = 0;
        int end = len - 1;
        
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(letters[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
                if(start == len){
                    return letters[0];
                }
            }           
        }
        
        return letters[start];
    }
}