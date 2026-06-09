class Solution {
    public long solution(int n) {  
        long[] fibo = new long[n+1];
        
        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == 1) fibo[i] = 1;
            else fibo[i] = (fibo[i-1] + fibo[i-2]) % 1234567;
        }
        
        return fibo[n];
    }
}