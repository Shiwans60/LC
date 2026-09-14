class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n > m ) return false;
        char[] f = s1.toCharArray();
        Arrays.sort(f);
        String fs = new String(f);
        
        for(int i = 0 ; i <= m - n; i++){
            String sub = s2.substring(i ,i + n);
            char[] curr = sub.toCharArray();
            Arrays.sort(curr);
            String currs = new String(curr);
            if(currs.equals(fs)){
                return true;
            }
        }
        return false;
        
    }
}
