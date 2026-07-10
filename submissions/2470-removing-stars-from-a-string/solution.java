class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
                for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*' && i < s.length()){        
                if(sb.length() != 0){
                    sb.deleteCharAt(sb.length() - 1);
                }
                continue;
            }
            if(i < s.length()){
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }
}
