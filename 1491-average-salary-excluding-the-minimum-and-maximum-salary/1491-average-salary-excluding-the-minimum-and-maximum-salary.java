class Solution {
    public double average(int[] salary) {
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        
        double sum = 0;
        
        for(int each: salary){
            sum += each;
            if(each < min) min = each;
            if(each > max) max = each;
        }
        
               
        return (double)((sum-min-max)/(salary.length - 2));
    }
}