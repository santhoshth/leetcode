class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] soldiers = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            soldiers[i] = ceil(mat[i]);
        }

        if(k > mat.length){
            k = mat.length;
        }

        int[] weakOrder = new int[k];
        for (int i = 0; i < k; i++) {
            int minIndex = min(soldiers);
            soldiers[minIndex] = -1;
            weakOrder[i] = minIndex;
        }

        return weakOrder;
    }
    
    public static int ceil(int[] row){
        int s = 0;
        int e = row.length-1;

        while (s <= e){
            int m = s + (e-s)/2;

            if(row[m] < 1){
                e = m - 1;
            } else {
                s = m +1;
            }
        }

        return s;
    }

    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0 && arr[i] < min){
                min = arr[i];
                index = i;
            }
        }

        return index;
    }
}