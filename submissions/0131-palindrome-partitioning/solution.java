class Solution {
    List<List<String>> l1 = new ArrayList<>();
    List<String> l2 = new ArrayList<>();
    public List<List<String>> partition(String s) {
        solve(s,0, l2);
        return l1; 
    }
    private void solve(String s,int idx, List<String> l2){
        if(idx == s.length() ){
            l1.add(new ArrayList<>(l2));
            return;
        }
        for(int i = idx ; i < s.length() ; i++){
            if(palindrome(s , idx , i)){
                l2.add(s.substring(idx, i+ 1));
                solve(s , i + 1, l2);
                l2.remove(l2.size() - 1);
                
            }
        }
        
    }
    private Boolean palindrome(String s, int l , int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;


    }
}
