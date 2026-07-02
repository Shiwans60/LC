class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n % groupSize != 0){
            return false;
        }
        TreeMap<Integer , Integer> t = new TreeMap<>();
        for(int i = 0; i < n ; i++){
            t.put(hand[i], t.getOrDefault(hand[i], 0) + 1);
        }
        while(!t.isEmpty()){
            int curr = t.firstKey();
            t.put(curr, t.get(curr) - 1);
            if(t.get(curr) == 0){
                t.remove(curr);
            }
            for(int i = 1; i < groupSize; i++){
                int y = curr + 1;
                if(t.containsKey(y)){
                    t.put(y, t.get(y) - 1);
                    if(t.get(y) == 0){
                        t.remove(y);
                    }
                    curr = y;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
