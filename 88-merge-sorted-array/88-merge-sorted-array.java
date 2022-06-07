class Solution {
    public void merge(int[] first, int f, int[] second, int s) {
        if(f == 0){
            int i = 0;
            while(i < s){
                first[i] = second[i];
                i++;
            }
            return;
        }

        if(s == 0){
            return;
        }

        int i = 0;
        int j = 0;
        while(i < f && j < s){
            if(first[i] <= second[j]){
                i++;
            } else {
                int temp = first[i];
                first[i] = second[j];
                second[j] = temp;
                sortSecond(second);
                i++;
            }
        }

        while(j < s && i < f+s){
            first[i] = second[j];
            i++;
            j++;
        }
    }
    
   public static void sortSecond(int[] arr){
        int i = 1;
        while(arr.length > 1 && i < arr.length && arr[i] < arr[i-1]){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
            i++;
        }
    }
}