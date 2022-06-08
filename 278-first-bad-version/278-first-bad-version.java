/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 1){
            return 1;
        }
        
        int start = 1;
        int end = n;
        
        while(start <= end){
            
            int mid  = start + (end - start)/2;
            
            if(isBadVersion(mid) == false && isBadVersion(mid+1) == true){
                return mid+1;
            }
            
            if(mid == 1 && isBadVersion(mid)){
                return mid;
            }
            
            if(isBadVersion(mid) == true){
                end = mid - 1;
            }else {
                start = mid +1;
            }
        }
        
        return -1;
    }
}