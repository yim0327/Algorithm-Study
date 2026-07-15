import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        
        // stack 초기화
        for (int p : prices) stack.add(p);
        
        int pre_num = 0;
        int second = 0;
        
        for (int i = prices.length-1; i >= 0; i--) {
            if (pre_num == 0) {
                pre_num = stack.pop();
                answer[i] = 0;
            }
            
            second++;
            answer[i] = second;
            
            int tmp = stack.pop();
            
            if (tmp > pre_num) second = 0;
        }
        
        return answer;
    }
}