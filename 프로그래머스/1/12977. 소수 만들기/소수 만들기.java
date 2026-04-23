class Solution {
    public boolean checkPrimeNumber(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
    
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    
                    if (checkPrimeNumber(num)) answer++;
                }
            }
        }

        return answer;
    }
}