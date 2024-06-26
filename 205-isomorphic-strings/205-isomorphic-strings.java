class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] dp1 = new int[128];
        int[] dp2 = new int[128];
        
        for(int i=0; i<s.length(); i++){
            if(dp1[s.charAt(i)]!=dp2[t.charAt(i)])
                return false;
            else if(dp1[s.charAt(i)]==0){
                dp1[s.charAt(i)]=dp2[t.charAt(i)]=i+1;
            }
        }
        return true;
    }
}