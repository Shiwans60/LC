class Solution {
    List<String> l = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        if(s.length() > 12) return l;
        int parts = 0;
        StringBuilder curr = new StringBuilder();
        solve(s , 0 , parts, curr);
        return l;
        
    }
    private void solve(String s , int idx, int parts, StringBuilder curr){
        if(idx == s.length() && parts == 4){
            curr.deleteCharAt(curr.length() - 1);
            l.add(curr.toString());
            curr.append('.');
            return;            
        }
        if(parts == 4 || idx == s.length()){
            return;
        }
        if(idx + 1 <= s.length()){
            curr.append(s.substring(idx, idx+1)).append('.');
            solve(s , idx+ 1, parts + 1, curr);
            curr.delete(curr.length() - 2 , curr.length());
        }
        if(idx + 2 <= s.length() && isvalid(s.substring(idx, idx+2))){
            curr.append(s.substring(idx, idx+2)).append('.');
            solve(s , idx+ 2, parts + 1, curr);
            curr.delete(curr.length() - 3 , curr.length());
        }
        if(idx + 3<= s.length() && isvalid(s.substring(idx, idx+3))){
            curr.append(s.substring(idx, idx+3)).append('.');
            solve(s , idx+ 3, parts + 1, curr);
            curr.delete(curr.length() - 4 , curr.length());
        }


    }
    private boolean isvalid(String s){
        if(s.charAt(0) == '0'){
            return false;
        }
        int num = Integer.parseInt(s);
        if(num > 255 || num < 0){
            return false;
        }
        return true;

    }
}
