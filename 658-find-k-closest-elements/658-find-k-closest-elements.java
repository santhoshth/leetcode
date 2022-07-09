class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int ans = getIndex(arr, x);
        System.out.println(ans);
        List<Integer> res = new ArrayList<>();
        int n = arr.length;
        int i = ans;
        int j = ans;
        
        while(k >= 0 && i >= 0 && j < n){
            if(x - arr[i] <= arr[j] - x){
                i--;
            } else {
                j++;
            } 
            k--;
        }
        
        while(k >= 0 && i >= 0){
            i--;
            k--;
        }
        
        while(k >= 0 && j < n){
            j++;
            k--;
        }
        
        for(int low = i+1; low < j; low++){
            res.add(arr[low]);
        }

        return res;
    }
    
    public int getIndex(int[] nums, int target){
        int s = 0;
        int e = nums.length - 1;
        
        while(s < e){
            int m = s + (e-s)/2;
            
            if(nums[m] < target){
                s = m+1;
            } else {
                e = m;
            }
        }
        
        return s;
    }
}