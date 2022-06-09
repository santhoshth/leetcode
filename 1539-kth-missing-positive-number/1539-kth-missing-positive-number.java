class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num = 1;
        int count = 0;

        while(num <= arr[arr.length-1]){
            if(!search(arr, num)){
                count += 1;
                if(count == k){
                    return num;
                }
            }
            num++;
        }

        if(k > count){
            return arr[arr.length-1] + k - count;
        }

        return -1;
    }
    
    public boolean search(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;

        while (s <= e){
            int m = s + (e-s)/2;

            if(nums[m] == target){
                return true;
            }

            if (nums[m] > target){
                e = m - 1;
            }else {
                s = m + 1;
            }
        }

        return false;
    }
}