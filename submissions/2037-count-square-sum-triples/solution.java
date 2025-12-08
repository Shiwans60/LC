class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int j = n ; j >=5 ; j--){
            for(int i = j - 1; i >= 1; i--){
                int root = (int) Math.sqrt((j*j) - (i*i));
                if(root*root == (j*j) - (i*i)){
                    count = count + 1;
                }

            }

        }
        return count;
        
        
    }
}
