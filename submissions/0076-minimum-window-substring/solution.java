class Solution {
    public String minWindow(String s, String t) {
        int l = 0;
        int r = 0;
        int formed = 0;
        int start =0;

        StringBuilder sb = new StringBuilder();
        int minc = Integer.MAX_VALUE;
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        
        for (char c : t.toCharArray()){
            tmap.put(c, tmap.getOrDefault(c,0)+1);
        }
        int required = tmap.size();
        
        while(r < s.length()){
            char c = s.charAt(r);
            smap.put(c, smap.getOrDefault(c,0)+1);

            if(tmap.containsKey(c) && tmap.get(c).intValue() == smap.get(c).intValue()){
                formed++;
            }
            while(l <= r && formed == required){
                if(r-l+1 < minc){
                    minc = r-l+1;
                    start = l;

                }
                char ch = s.charAt(l);
                smap.put(ch,smap.get(ch)-1);
                if (tmap.containsKey(ch) && smap.get(ch) < tmap.get(ch)){
                    formed--;
                }
                l++;
            }
            r++;
            
        }
        if(minc == Integer.MAX_VALUE){
            return "";
        }
        else{
            return s.substring(start, start + minc);
        }     
    }
}
