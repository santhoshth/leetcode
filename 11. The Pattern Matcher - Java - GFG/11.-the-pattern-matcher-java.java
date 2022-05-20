// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
	     //Taking input using Scanner class
    	 Scanner sc = new Scanner(System.in);
    	 
    	 //taking count of total testcases
    	 int t = sc.nextInt();
    	 
    	 boolean flag = false;
    	 while(t-- > 0){
    	   
    	   //taking the String
    	   String s=sc.next();
    	   
    	   Geeks obj=new Geeks();
    	   
    	   //calling follPatt() method
    	   //of class Geeks and passing
    	   //String as parameter
    	   obj.follPatt(s);
    	   
    	 }
    }
}


 // } Driver Code Ends
//User function Template for Java



class Geeks{
    
    static void follPatt(String s)
    {
        int n = s.length();
        
        // If the length of string is 1, It wont satisfy x^n y^n condition
        if(n == 1){
            System.out.println("0");
            return;
        }
        
        // If the length of string is not even, It wont satisfy x^n y^n condition
        if(n % 2 != 0){
            System.out.println("0");
            return;
        }
        
// If the last character is not 'y', It wont satisfy x^n y^n condition
        if(s.charAt(n-1) != 'y'){
            System.out.println("0");
            return;
        }
        
                // If the last character of first half is not 'x', It wont satisfy x^n y^n condition
        if(s.charAt(n/2-1) != 'x'){
            System.out.println("0");
            return;
        }
            
        
        // If number of x is not equal to number of y then it wont satisfy x^n y^n condition
        int countX=0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'x'){
                countX++;
            }
        }
        if(countX == n/2) 
            System.out.println("1");
    }

}


// { Driver Code Starts.
  // } Driver Code Ends