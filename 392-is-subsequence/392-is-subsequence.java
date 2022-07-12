class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if(sLength == 0) return true;
        
        int i = 0;
        int j = 0;
        
        while(i < sLength && j < tLength){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            } else {
                j++;
            }         
        }
        
        return i == sLength ? true : false;
        
    }
}