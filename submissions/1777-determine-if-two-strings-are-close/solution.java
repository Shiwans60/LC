class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        if (n1 != n2) return false;
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        for(char c : word1.toCharArray()){
            h1.put(c, h1.getOrDefault(c, 0) + 1);
        }
        for(char c : word2.toCharArray()){
            h2.put(c, h2.getOrDefault(c, 0) + 1);
        }
        for(Integer v : h2.values()){
            boolean f = false;
            for(Map.Entry<Character, Integer> entry : h1.entrySet()){
                if(entry.getValue().equals(v)){
                    entry.setValue(0);
                    f = true;
                    break;
                }
            }
            if(!f) return false;
        }
        for(Character k : h2.keySet()){
            if (!h1.containsKey(k)){
                return false;
            }
        }

        return true;  
    }
}
