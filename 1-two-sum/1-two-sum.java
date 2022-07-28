class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();        
                
        int i = 0;
        while(i < nums.length){
            int diff = target - nums[i];
            if(map.containsKey(diff)) return new int[]{i, map.get(diff)};
            map.put(nums[i], i);
            i++;
        }
        
        return new int[]{-1,-1};
    }
}