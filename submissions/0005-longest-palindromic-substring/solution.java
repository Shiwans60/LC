class Solution {
    public String longestPalindrome(String s) {
        int maxl =0;
        int start = 0;  
        if(s.length() == 1){
            return s.substring(0);
        }
        for(int i = 0; i < s.length() ; i++){
            int h = i + 1;
            int l = i - 1;
            
            while(l >= 0 && h <= s.length()-1 && s.charAt(h) == s.charAt(l) ){
                    h++;
                    l--;
            }
            int len = h - l - 1;
            if (len > maxl){
                maxl = len;
                start = l+ 1;
            }                                
            
            l = i;
            h = i+ 1;
            while(h <= s.length() - 1 && l >= 0 && s.charAt(h) == s.charAt(l) ){
                    h++;
                    l--;
            }
            len = h - l - 1;
            if (len > maxl){
                maxl = len;
                start = l+ 1;
            }
            // else if (i > 0 && s.charAt(i) == s.charAt(l) ){
            //     h = i;
            //     while(h <= s.length() - 1 && l >= 0 && s.charAt(h) == s.charAt(l) ){
            //         h++;
            //         l--;
            //     }
            // }
            // else {
            //     l = i - 1;
            //     h = i + 1;
            // }
            // int len = h - l - 1;
            // if (len > maxl){
            //     maxl = len;
            //     start = l+ 1;
            // }
        }
        return s.substring(start, start + maxl);
    }
}
