class Solution {
    private boolean checkPrimeNumber(Long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
    
    public int solution(int n, int k) {
        int answer = 0;
        
        String[] nums = Integer.toString(n, k).split("[0]+");
        
        for (String i : nums) {
            Long num = Long.parseLong(i);
            if (checkPrimeNumber(num)) answer++;
        }
        
        return answer;
    }
}