import java.util.Arrays;

class Solution {
    public String solution(String s) {
        
        for(int i = 1; i < s.length(); i++){
            String find = String.valueOf(s.charAt(i-1));
            
            if(s.substring(i).contains(find)){
                s = s.replace(find, " ");
            }
        }
        
        s = s.replace(" ", "");
        
        String[] tmp = s.split("");
        Arrays.sort(tmp);
        
        return String.join("", tmp);
    }
}