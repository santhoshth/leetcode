class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
               
        int even = 0;
        int odd = 0;
               
        for(HashMap.Entry<Character, Integer> each: map.entrySet()){
            int val = each.getValue();
            
            if(val % 2 == 0) even += val;
            else {
                even += val-1;
                odd = 1;
            }
        }
               
        return even + odd;
    }
}