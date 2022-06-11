class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int length = matrix.length;
        int subLength = matrix[0].length;

        int i = 0;
        while (i < length){
            int temp = matrix[i][subLength-1];
            if(temp == target){
                return true;
            }

            if(temp < target){
                i++;
            } else {
                return search(matrix[i], target);
            }
        }

        return false;
    }
    
    public boolean search(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;

        while (s <= e){
            int m = s + (e-s)/2;

            if(nums[m] == target){
                return true;
            }

            if(nums[m] > target){
                e = m -1;
            }else {
                s = m +1;
            }
        }

        return false;
    }
}
