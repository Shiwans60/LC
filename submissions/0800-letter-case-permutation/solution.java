class Solution {
    List<String> l1 = new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        StringBuilder sb = new StringBuilder();
        solve(s , 0 , sb);
        return l1;
        
    }
    private void solve(String s , int i , StringBuilder sb){
        if(i == s.length()){
            l1.add(sb.toString());
            sb = new StringBuilder();
            return;
        }
        if(Character.isDigit(s.charAt(i))){
            sb.append(s.charAt(i));
            solve(s , i + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
            return;
        }
        sb.append(Character.toUpperCase(s.charAt(i)));
        solve(s , i + 1, sb);
        sb.deleteCharAt(sb.length() - 1);
        sb.append(Character.toLowerCase(s.charAt(i)));
        solve(s , i + 1, sb);
        sb.deleteCharAt(sb.length() - 1);
        

    }
}
