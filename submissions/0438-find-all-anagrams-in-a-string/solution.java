class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        char[] p_ = p.toCharArray();
        Arrays.sort(p_);
        String f = new String(p_); 
        List<Integer> res = new ArrayList<>();
        for(int i = 0 ; i <= n - m ; i++){
            String sub = s.substring( i , i + m);
            char[] sub_ = sub.toCharArray();
            Arrays.sort(sub_);
            String sec = new String(sub_);
            if(sec.equals(f)){
                res.add(i);
            }
        } 
        return res;
    }
}
