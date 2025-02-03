import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] st = my_string.split("");
        
        for(int i = 0; i < indices.length; i++){
            st[indices[i]] ="";
        }
        
        for(int j = 0; j < my_string.length(); j++){
            answer += st[j];
        }
        
        return answer;
    }
}