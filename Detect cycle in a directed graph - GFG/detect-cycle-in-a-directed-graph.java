// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] visit = new boolean[V];
        boolean[] recS = new boolean[V];
        
        for(int i = 0; i < V; i++){
            if(!visit[i]){
                if(cycle(i, adj, visit, recS)) return true;
            }
        }
        
        return false;
    }
    
    public boolean cycle(int v, ArrayList<ArrayList<Integer>> list, boolean[] vis, boolean[] stack){
        vis[v] = true;
        stack[v] = true;
        
        for(int each: list.get(v)){
            if(!vis[each]){
                if(cycle(each, list, vis, stack)) return true;
            }
            else if(stack[each]){
                return true;
            }
        }
        stack[v] = false;
        return false;
    }
}