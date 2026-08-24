class Solution {
    List<String> l1 = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        HashMap<Integer, String> map = new HashMap<>();
        String[] let = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for(int i = 2 ; i <= 9; i++){
            map.put(i , let[i]);
        }
        int n = digits.length();
        StringBuilder sb = new StringBuilder();
        solve(digits, 0, n, sb, map);
        return l1;  
    }
    private void solve(String digits, int i , int n, StringBuilder sb, HashMap<Integer, String> map){
        if(i >= n){
            l1.add(sb.toString());
            return;
        }
        int d = digits.charAt(i) - '0';
        String s1 = map.get(d);
        int m = s1.length();

        for(int j = 0 ; j < m ; j++){
            sb.append(s1.charAt(j));
            solve(digits, i + 1, n , sb, map);
            sb.deleteCharAt(sb.length() - 1);
        }
        
    }
}
