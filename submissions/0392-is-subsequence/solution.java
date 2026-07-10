class Solution {
    public boolean isSubsequence(String s, String t) {
        int si = 0;
        int ti = 0;
        for(int i = 0; i < t.length() ; i++){
            if(si == s.length()){
                break;

            }
            if(s.charAt(si) == t.charAt(ti) && ti<= t.length()){
                si++;
                ti++;
                
            }
            else{
                ti++;
            }

        }
        if(si == s.length()){
            return true;
        }
        return false;
        
    }
}
