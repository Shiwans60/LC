class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int r = 0;
        int l = 0;
        int count = 0;
        int maxc = 0;
        HashSet<Character> set = new HashSet<>();
        while(r < arr.length){
            if(!set.contains(arr[r])){
                set.add(arr[r]);
                maxc = Math.max(maxc, r-l+1);
                r++;
            }
            else{
                set.remove(arr[l]);
                l++;
            }
        }
        return maxc;
        

        
    }
}
