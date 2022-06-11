class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            int index = 0;
            if(grid[i].length > 0 && grid[i][0] >= 0){
                index = search(grid[i]);
            }
            count += grid[i].length - index;
        }

        return count;
    }
    
    public int search(int[] nums){
        int s = 0;
        int e = nums.length-1;

        while (s <= e){
            int m = s + (e-s)/2;

            if(nums[m] == 0){
                while(m < nums.length-1 && nums[m+1] == 0){
                    m += 1;
                }
                return m+1;
            }

            if(nums[m] > 0){
                s = m + 1;
            }else {
                e = m -1;
            }
        }

        return s;
    }
}