import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Deque<Integer> stack = new ArrayDeque<>();
        
        stack.push(0);
        
        for (int i = 1; i < prices.length; i++) {
            // '현재값보다 작은 경우'일 시,
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int pre_idx = stack.pop();      // 인덱스 꺼내기
                answer[pre_idx] = i - pre_idx;  // 기간 계산
            }
            stack.push(i);
        }
        
        // 남은 '현재값보다 크거나 같은 경우' 계산
        while (!stack.isEmpty()) {
            int pre_idx = stack.pop();
            answer[pre_idx] = prices.length - pre_idx -1;
        }
        
        return answer;
    }
}