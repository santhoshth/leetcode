// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().search (arr, n));
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int search(int A[], int N)
    {
        // your code here
        int start = 0;
        int end = N-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(mid % 2 != 0){
                if(mid > 0 && A[mid] == A[mid-1]){
                    start = mid + 1;
                } else if(mid < N-1 && A[mid] == A[mid+1]){
                    end = mid - 1;
                }else{
                    return A[mid];
                }
            }
            
            if(mid%2 == 0){
                if(mid > 0 && A[mid] == A[mid-1]){
                    end = mid - 1;
                } else if(mid < N-1 && A[mid] == A[mid+1]){
                    start = mid + 1;
                }else{
                    return A[mid];
                }
            }
            
        }
        
        return -1;
        
    }
}