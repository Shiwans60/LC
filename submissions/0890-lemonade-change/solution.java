class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c5 = 0;
        int c10 = 0;
        int c20 = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                c5++;
            }
            else if(bills[i] == 10){
                c10++;
                if(c5 == 0){
                    return false;
                }
                c5--;
            }
            else if(bills[i] == 20){
                c20++;
                if(c10 == 0){
                    if(c5 < 3){
                        return false;
                    }
                    else {
                        c5 = c5 -3;
                    }
                }
                else{
                    c10--;
                    if(c5 == 0){
                        return false;
                    }
                    else{
                        c5 = c5 - 1;
                    }
                    
                }
            }
        }
        return true;

        
    }
}
