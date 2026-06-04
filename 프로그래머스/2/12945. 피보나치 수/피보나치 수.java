class Solution {
    public int solution(int n) {
        int[] fibo = {0, 1};
        
        for (int i = 2; i < n; i++) {
            int tmp = (fibo[0] + fibo[1]) % 1234567;
            if (i % 2 == 0) fibo[0] = tmp;
            else fibo[1] = tmp;
        }
        
        return (fibo[0] + fibo[1]) % 1234567;
    }
}