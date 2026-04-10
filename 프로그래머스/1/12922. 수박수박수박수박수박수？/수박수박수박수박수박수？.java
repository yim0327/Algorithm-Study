class Solution {
    public String solution(int n) {
        int cnt = (int)n/2;
        
        String answer = "수박".repeat(cnt);
        
        if (n % 2 != 0) {
            answer += "수";
        }
        
        return answer;
    }
}