class Solution {
    public int maxLength(List<String> arr){
        if(arr.size() == 0) return 0;
        return solve(arr , 0 , "");
    }
    private int solve(List<String> arr , int idx, String s1){
        int n = arr.size();
        if( idx >= n) return s1.length();
        int ans = s1.length();

        for(int i = idx ; i < n ; i++){
            String next = s1 + arr.get(i);
            if(right(next )){
                ans = Math.max(ans ,solve(arr , i + 1, next ));
            }
            
        }
        return ans;
    }
    private boolean right(String s1){
        for(int i = 0 ; i < s1.length(); i++){
            for(int j = i+1 ; j < s1.length(); j++){
                if(s1.charAt(i) == s1.charAt(j)){
                    return false;
                }
            }

        }
        return true;
    }
}
