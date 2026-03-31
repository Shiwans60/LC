class Solution {
    public int myAtoi(String s) {
        int result = 0;
        Boolean rdetected = false;
        int sign = 1;
        StringBuilder sb = new StringBuilder();
        for(char r : s.toCharArray()){
            
            if(!rdetected && sb.length() == 0 && r == ' '){
                continue;
            }
            
            if(!rdetected && sb.length() == 0 && (r == '-' || r == '+')){
                if(r == '-'){
                    sign = -1;
                }
                rdetected = true;
                continue;
            }
            if(Character.isDigit(r)){
                rdetected = true;
                sb.append(r);
            }
            else{
                break;
            }
            
        }
        
        
        for(int i = 0; i < sb.length(); i++){
            int digit = sb.charAt(i) - '0';

            if(result > (Integer.MAX_VALUE - digit)/10){
                return (sign == -1) ? Integer.MIN_VALUE:Integer.MAX_VALUE;
            }

            result = result* 10 + digit;
            
        }
        
        return sign * result;


    }
}
