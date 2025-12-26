class Solution {
    public int bestClosingTime(String customers) {
        int cy =0;
        int cn= 0;
        for(int i = 0; i < customers.length(); i++){
            if(customers.charAt(i) == 'Y' ){
                cy++;
            }
            else{
                cn++;
            }
        }
        int pn =0;
        int sy =cy;
        int penalty = pn+sy;
        int minp = penalty;
        int reqj = 0;
        for(int j = 1; j <= customers.length(); j++){
                if(customers.charAt(j - 1) == 'Y'){
                    sy--;

                }
                else if(customers.charAt(j - 1) == 'N'){
                    pn++;
                }
                penalty = pn+ sy;
                if(penalty < minp ){
                    minp = penalty;
                    reqj = j;
                }
                
        }
        return reqj;
        
    }
}
