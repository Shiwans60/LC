class Solution {
    public boolean checkValidString(String s) {
        int c = 0;
        int e = 0;
        int n = s.length();
        int c2 = 0;
        int e2 = 0;

        for(int i = n -1 ; i >=0; i--){
            if(s.charAt(i) == '*'){
                e2++;
            }
            if(s.charAt(i) == ')'){
                c2++;
            }
            if(s.charAt(i) == '('){
                c2--;
                if(c2 < 0 && Math.abs(c2) > e2 ){
                    return false;
                }
            }
            
        }
        
        for(char ch : s.toCharArray()){
            if(ch == '*'){
                e++;
            }
            if(ch == '('){
                c++;
            }
            if(ch == ')'){
                c--;
                if(c < 0 && Math.abs(c) > e ){
                    return false;
                }
            } 
        }
        if(c > 0 && e < c ){
            return false;
        }
        if(c2 > 0 && e2 < c2){
            return false;
        }
        return true;   
    }
}
