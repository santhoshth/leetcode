class Solution {
    public List<String> letterCombinations(String digits) {
        return recursion("", digits);
    }
    
    public List<String> recursion(String ans, String up){
        if(up.isEmpty()){
            List<String> res = new ArrayList<>();
            if(!ans.isEmpty()){
                res.add(ans);
            }
            return res;
        }

        List<String> result = new ArrayList<>();

        String c = up.charAt(0) + "";
        int a = Integer.parseInt(c);
        if(a <= 1){
            result.addAll(recursion(ans, up.substring(1)));
        }

        int endManipulation = 0;
        int startManipulation = 0;

        if(a == 7){
            endManipulation = 1;
            startManipulation = -1;
        }

        if(a == 8){
            endManipulation = 1;
        }

        if(a == 9){
            endManipulation = 2;
            startManipulation = -1;
        }

        int end = ((a-1) * 3) + endManipulation;
        int start = (end - 3) + startManipulation;

        while(start >= 0 && start < end) {
            result.addAll(recursion(ans + (char)('a' + start), up.substring(1)));
            start++;
        }

        return result;
    }
}