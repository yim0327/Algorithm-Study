import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int idx = score.length - m;
        
        Arrays.sort(score);
        
        for (int i = 0; i < score.length / m; i++) {
            answer += score[idx] * m;
            
            if (idx - m < 0) break;
            idx -= m;
        }
        
        return answer;
    }
}