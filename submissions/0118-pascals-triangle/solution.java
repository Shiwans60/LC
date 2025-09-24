class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        for ( int i = 0; i < numRows ; i++){
            l.add(new ArrayList<>());
            if(numRows == 1){
                l.get(0).add(1);
                return l;
            }
            if(i < 1){
                l.get(0).add(1);
            }
            if(i == 1){
                l.get(i).add(1);
                l.get(i).add(1);

            }
            if( i > 1){
                l.get(i).add(1);
                for ( int j = 1; j < i ; j++){
                    int sum = 0;
                    if(j == 1){
                        sum = 1 + l.get(i - 1).get(j);
                    }
                    else if(j == i -1 ){
                        sum = 1 + l.get(i-1).get(j-1);
                    }
                    else if(j > 1 && j < i-1){
                        sum = l.get(i-1).get(j-1) + l.get(i-1).get(j);
                    }
                    l.get(i).add(sum);
                }
                l.get(i).add(1);
                    
            }
        }
        return l;
        
        
    }
}
