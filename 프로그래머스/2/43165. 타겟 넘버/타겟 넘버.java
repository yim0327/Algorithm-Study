class Solution {
    static int result = 0;
    
    private void dfs(int[] numbers, int target, int sum, int depth) {
        if (depth >= numbers.length) {
            if (sum == target) result++;
            return;
        }
        else {
            int num = numbers[depth];
            depth += 1;
        
            dfs(numbers, target, sum+num, depth);
            dfs(numbers, target, sum-num, depth);
        }
    }
    
    public int solution(int[] numbers, int target) {
        int sum = 0;
        int depth = 0;
        
        dfs(numbers, target, sum, depth);
        
        return result;
    }
}