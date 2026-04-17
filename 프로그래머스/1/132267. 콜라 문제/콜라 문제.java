class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            int remain = n % a;
            answer += n / a * b;
            n = n / a * b + remain;
        }
        
        return answer;
    }
}
