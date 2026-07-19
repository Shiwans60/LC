class Solution {
    public String smallestSubsequence(String s) {
        int[] last = new int[26];
        boolean visited[] = new boolean[26];
        int n = s.length();
        for(int i = 0; i < n; i++){
            last[s.charAt(i) - 'a'] = i;
        } 
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(visited[c - 'a'] == true){
                continue;
            }
            while(sb.length() > 0 && sb.charAt(sb.length() - 1) > c && last[sb.charAt(sb.length() - 1) - 'a'] > i){
                visited[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(c);
            visited[c - 'a'] = true;

        }
        return sb.toString();
    }
}
