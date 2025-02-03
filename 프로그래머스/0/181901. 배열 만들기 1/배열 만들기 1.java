import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[(int)n/k];
        int j = 0;
        
        for(int i = k; i <= n; i+=k){
            answer[j] = i;
            j++;
        }
        
        Arrays.sort(answer);
        return answer;
    }
}