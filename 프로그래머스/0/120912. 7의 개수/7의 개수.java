import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        String st = Arrays.toString(array);
        for(int i = 0; i < st.length(); i++){
            if(st.charAt(i) - '0' == 7){
                answer++;
            }
        }
        
        return answer;
    }
}