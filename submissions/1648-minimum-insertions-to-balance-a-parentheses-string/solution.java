class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int res = 0;
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == '('){
                open++;
                i++;
            }
            else{
                if(open > 0){
                    open--;
                }else{
                    res++;
                }
                if( i + 1 < s.length() && s.charAt(i + 1) == ')'){
                    i += 2;
                }else{
                    res++;
                    i++;
                }
               
            }
        }
        return res + (2 * open);
    }
}
