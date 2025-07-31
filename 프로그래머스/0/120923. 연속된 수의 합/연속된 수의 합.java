import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        List<Integer> l = new ArrayList(10);
        int check = 0;
        
        if(num % 2 == 0) {  // num = 짝수
            float x = total / num;
            l.add((int)x);
            l.add((int)x + 1);
            check = 2*(int)x + 1;
            
        }
        else {              // num = 홀수
            int y = total / num;
            l.add(y);
            check = y;
        }
                
        while(num != l.size()){
            l.add(0, l.get(0)-1);
            l.add(l.get(l.size()-1)+1);
            check += l.get(0) + l.get(l.size()-1);
        }
        
        int[] answer = new int[l.size()];
        for(int i = 0; i < l.size(); i++) {
            answer[i] = l.get(i);
        }
        
        return answer;
    }
}