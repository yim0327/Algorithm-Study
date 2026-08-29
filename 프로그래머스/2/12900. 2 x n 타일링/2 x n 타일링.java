class Solution {
    static final int DIVISOR = 1_000_000_007;
    
    private int function(int n, int[] num_case) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (num_case[n] != 0) return num_case[n];
                
        num_case[n] = (function(n-1, num_case) + function(n-2, num_case)) % DIVISOR;
        return num_case[n];
    }
    
    public int solution(int n) {
        int[] num_case = new int[n+1];
        return function(n, num_case);
    }
}