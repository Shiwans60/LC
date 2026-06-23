class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if(m == 0) return 0;
        if(m > n) return -1;
        for(int i = 0; i <= n - m; i++){
            int j = 0;
            while(j < m && haystack.charAt(i + j) == needle.charAt(j)){
                j++;
            }
            if(j == m){
                return i;
            }
        }
        return -1;
        // while(i < n){
        //     for(int j = 0; j < m ;j++){
        //         if(haystack.charAt(i) == needle.charAt(j)){
        //             int req = i;
        //             i++;
        //             j++;
        //             if(j == m-1){
        //                 return req;
        //             }
                    
        //         }
        //         else{
        //             break;
        //         }
                
        //     }
            
        //     return -1;
            
        // }
        // return -1;
        
    }
}
