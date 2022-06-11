class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            int negativeStartingPosition = 0;
            // if complete array is not less than 0 then search for negative starting position
            if(grid[i].length > 0 && grid[i][0] >= 0){
                negativeStartingPosition = search(grid[i]);
            }
            count += grid[i].length - negativeStartingPosition;
        }

        return count;
    }
    
    public int search(int[] nums){
        int s = 0;
        int e = nums.length-1;

        while (s <= e){
            int m = s + (e-s)/2;

            if(nums[m] == 0){
                // to skip the duplicate zeros
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