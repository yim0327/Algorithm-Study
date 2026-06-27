import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = numbers.length-1; i >= 0; i--) {
            while (!stack.isEmpty()) {
                int num = stack.pop();

                if (num > numbers[i]) {
                    answer[i] = num;
                    stack.push(num);
                    stack.push(numbers[i]);
                    break;
                }
            }
            
            if (stack.isEmpty()) {
                stack.push(numbers[i]);
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}