class Solution {
    public String solution(String n_str) {
        int i = 0;
        
        if(n_str.charAt(i) == '0'){
            while(n_str.charAt(i) == '0'){
                i++;
            }
        }
        else{
            return n_str;
        }
        
        return n_str.substring(i);
    }
}