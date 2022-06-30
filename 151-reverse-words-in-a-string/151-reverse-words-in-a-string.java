class Solution {
    public String reverseWords(String s) {
        
        String[] arr = s.split(" ");
        // System.out.println(Arrays.toString(arr));
        StringBuilder result = new StringBuilder();
        
        int i = arr.length - 1;
        while( i >= 0 ){
            if(!arr[i].equals("")){
                result.append(arr[i].trim());
                result.append(" ");
            }
            i--;
        }
        
        return result.toString().trim();
    }
}