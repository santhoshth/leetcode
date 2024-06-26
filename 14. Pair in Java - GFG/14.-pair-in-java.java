// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// Pair class
class Pair{
    int x;
    int y;
    
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}


 // } Driver Code Ends
//User function Template for Java
// Custom comparator class to sort the pairs
// on the basis of first element
class custom_Compare{
    
    // Compare function
    static void sortPairs(Pair arr[], int N){
        
        // Your code here
        for(int i = 1; i < N;i++){
            for(int j = 0; j < N-1;j++){
                if(arr[j].x > arr[j+1].x){
                    int tempX = arr[j].x;
                    arr[j].x = arr[j+1].x;
                    arr[j+1].x = tempX;
                    
                    int tempY = arr[j].y;
                    arr[j].y = arr[j+1].y;
                    arr[j+1].y = tempY;
                    
                }
            }
        }
        
        //printing the x,y Pairs
        for(int i = 0;i<N;i++){
            System.out.print(arr[i].x + " " + arr[i].y + " ");
        }
        System.out.println();
    }
    
    
    // static void swapX(int[] nums, int f, int s){
    //     int temp = nums[f].x;
    //     nums[f].x = nums[s].x;
    //     nums[s].x = temp;
    // }
    
    // static void swapY(int[] nums, int f, int s){
    //     int temp = nums[f].y;
    //     nums[f].y = nums[s].y;
    //     nums[s].y = temp;
    // }
}

// { Driver Code Starts.

// Driver class with main function
class GFG {
    
    // Driver code
	public static void main (String[] args) {
		
		//taking input using Scanner class 
		Scanner sc = new Scanner(System.in);
		
		//taking count of testcases
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    
		    //taking count of elements
		    int N = sc.nextInt();
		    
		    // Creating an array of Pair
		    Pair arr[] = new Pair[N];
		    
		    //adding elements to Pair array
		    for(int i = 0;i<N;i++){
		        int x = sc.nextInt();
		        int y = sc.nextInt();
		        arr[i] = new Pair(x, y);
		    }
		    
		    //creating an object of custom_Compare class
		    custom_Compare obj = new custom_Compare();
		    
		    //calling sortPairs() method of
		    //class  custom_Compare
		    obj.sortPairs(arr, N);
		}
	}
}  // } Driver Code Ends