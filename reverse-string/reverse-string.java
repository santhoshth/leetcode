class Solution {
    public void reverseString(char[] s) {
            reverse(s, 0, s.length-1);
            System.out.println(Arrays.toString(s));
    }
    
    public void reverse(char[] s, int i, int j){
        if(i > j){
            return;
        }
        
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        
        reverse(s, i+1, j-1);
    }
}