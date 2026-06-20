import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new ArrayDeque<>();
        
        for (int p : priorities) {
            queue.offer(p);
        }
        
        int answer = 0;
        
        while (location > -1) {
            int tmp = queue.poll();
            
            Iterator<Integer> it = queue.iterator();
            boolean flag = true;
            
            while(it.hasNext()) {
                if (tmp < it.next()) {
                    flag = false; // 다시 대기
                    queue.offer(tmp);
                    break;
                }
            }
            
            if (location == 0) {
                if (flag) location = -1;
                else location = queue.size()-1;
            }
            else {
                location--;
            }
            
            if (flag) answer++; // 실행
        }
        
        return answer;
    }
}