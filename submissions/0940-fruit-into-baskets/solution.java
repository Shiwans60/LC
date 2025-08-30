class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0;
        int r = 0;
        
        int maxc = Integer.MIN_VALUE;
        HashMap<Integer, Integer> h = new HashMap<>();
        while(r < fruits.length){
            int i = fruits[r];
            h.put(i, h.getOrDefault(i,0)+1);
          
            
            while(h.size() > 2 ){
                h.put(fruits[l], h.get(fruits[l])-1);
                if(h.get(fruits[l])  == 0){
                    h.remove(fruits[l]);
                }
                l++;
            }  
            if(h.size() <= 2){
               maxc = Math.max(maxc, r- l+1);

            }
            r++;    
        }
        return maxc;
    }       
}
