class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int req = n + m;
        int min = Math.min(n, m);
        int x = 0;
        int y = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< req; i++){
            if(i %2 == 0 && x < n){

                sb.append(word1.charAt(x));
                x++;
            }
            else if(i %2 != 0 && y < m){
                sb.append(word2.charAt(y));
                y++;
            }
        }
        if(n > min){
            for(int i = x; i < n ; i++){
                sb.append(word1.charAt(i));
            }
        }
        else if(m > min){
            for(int i = y; i < m ; i++){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}
