import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for (int n : d) {
            if (n <= budget) {
                budget -= n;
                answer++;
            }
            else break;
        }
        
        return answer;
    }
}