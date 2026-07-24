class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        StringBuilder v = new StringBuilder();
        for(int i = 0; i < n ; i++){
            if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'||s.charAt(i) == 'A'||s.charAt(i) == 'E'||s.charAt(i) == 'I'||s.charAt(i) == 'O'||s.charAt(i) == 'U'){
                v.append(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        int j = v.length() - 1;
        for(int i = 0; i < n ; i++){
            
            if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'||s.charAt(i) == 'A'||s.charAt(i) == 'E'||s.charAt(i) == 'I'||s.charAt(i) == 'O'||s.charAt(i) == 'U'){
                sb.append(v.charAt(j));
                j--;
            }
            else{
                sb.append(s.charAt(i));
            }
            
        }
        return sb.toString();
    }
}
