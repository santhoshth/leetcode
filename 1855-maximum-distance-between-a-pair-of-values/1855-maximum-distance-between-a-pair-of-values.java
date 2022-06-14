class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=0,j=0,max=0;
        while (j < nums2.length)
        {
            if (i < nums1.length && nums2[j] >= nums1[i])
            {
                max=Math.max(max,j-i);
                j++;
            }
            else
            {
                i++;
                j++;
            }
        }
        return max;
    }
}