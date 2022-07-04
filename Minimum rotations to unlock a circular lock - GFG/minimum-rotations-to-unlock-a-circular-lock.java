// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            long R = Long.parseLong(a[0]);
            long D = Long.parseLong(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.rotationCount(R, D));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int rotationCount(long R, long D){
        // code here
        
        long rotation = 0;
        int n = (int)(Math.log10(R)+1);
        
        for(int i = 0; i < n; i++){
            
            long f = R%10;
            long s = D%10;
            
            R = R / 10;
            D = D / 10;
            
            if(Math.abs(f-s) > 5){
                rotation += 10 - Math.abs(f-s); 
            } else {
                rotation += Math.abs(f-s); 
            }
        }
        
        return (int)rotation;
        
    }
}