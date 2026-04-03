class Solution {
    public long solution(long n) {
        
        if (Math.sqrt(n) == (long)Math.sqrt(n)) {
            long x = (long)Math.sqrt(n) + 1;
            return (long)Math.pow(x, 2);
        }
        
        return -1;
    }
}