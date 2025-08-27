class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char[] arr = answerKey.toCharArray();
        int l = 0;
        int r = 0;
        int maxt = 0;
        int maxf = 0;
        int count = 0;
        int countF = 0;
        while(r < arr.length){ //str.toCharArray()
            if(arr[r] == 'F'){
                count++;
            }
            while(count > k){
                if(arr[l] == 'F'){
                    count--;

                }
                l++;
            }
            if(count<=k){
                maxt=Math.max(maxt,r-l+1);
            }
                
            r++;
        }
        l = 0;
        r = 0;
        while(r < arr.length){
            if(arr[r] == 'T'){
                countF++;
            }
            while(countF>k){
                if(arr[l] == 'T'){
                    countF--;

                }
                l++;
            }
            if(countF<=k){
                maxf=Math.max(maxf,r-l+1);
            }   
            r++;
        }
        return Math.max(maxt,maxf);
        
        
    }
}
