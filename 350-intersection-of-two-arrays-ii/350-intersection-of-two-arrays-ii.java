class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> res = new ArrayList<>();

        int p=0,q=0;
        for(;p < nums1.length && q < nums2.length;){
                if(nums1[p] == nums2[q]){
                    res.add(nums1[p]);
                    p++;q++;
                }
                else{
                if(nums1[p]<nums2[q]){
                    p++;
                }
                else q++;
            }            
        }
        
        int[] ans = new int[res.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = res.get(i);
        }
        
        return ans;
    }
}