import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int box = 1;
        Deque<Integer> stk = new ArrayDeque<>();
        
        for (int o : order) {
            while (box < o) {
                stk.push(box);
                box++;
            }
            
            if (box == o) {
                answer++;
                
                if (box == order.length) box = stk.pop();
                else box++;
            }
            else if (box > o) {
                if (stk.peek() == o) {
                    answer++;
                    stk.pop();
                }
                else break;
            }
        }
        
        return answer;
    }
}