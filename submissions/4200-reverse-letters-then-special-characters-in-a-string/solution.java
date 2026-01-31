class Solution {
    public String reverseByType(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l = 0;
        int r = sb.length() - 1;
        while(l<r ){
            
            if(Character.isLetter(sb.charAt(l)) && !Character.isLetter(sb.charAt(r))){
                r--;
            }
            else if(!Character.isLetter(sb.charAt(l)) && Character.isLetter(sb.charAt(r))){
                l++;
            }
            else if(Character.isLetter(sb.charAt(l)) && Character.isLetter(sb.charAt(r))){
                char temp = sb.charAt(l);
                sb.setCharAt(l, sb.charAt(r));
                sb.setCharAt(r, temp);
                l++;
                r--;
            }
            else{
                l++;
                r--;
            }

        }
        int j =0;
        int k = sb.length() -1;
        while(j<k ){
            if(Character.isLetterOrDigit(sb.charAt(j)) && !Character.isLetterOrDigit(sb.charAt(k))){
                j++;
            }
            else if(!Character.isLetterOrDigit(sb.charAt(j)) && Character.isLetterOrDigit(sb.charAt(k))){
                k--;
            }
            else if(!Character.isLetterOrDigit(sb.charAt(j)) && !Character.isLetterOrDigit(sb.charAt(k))){
                char temp = sb.charAt(j);
                sb.setCharAt(j, sb.charAt(k));
                sb.setCharAt(k, temp);
                j++;
                k--;
            }
            else{
                j++;
                k--;
            }
        }
        return sb.toString();
    }
}
