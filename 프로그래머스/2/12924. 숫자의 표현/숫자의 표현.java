class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            int value = 0;
            int w = 0;
            
            while(value < n) {
                value += i + w;
                w++;
            }
            
            if (value == n) answer++;
        }
        
        return answer;
    }
}