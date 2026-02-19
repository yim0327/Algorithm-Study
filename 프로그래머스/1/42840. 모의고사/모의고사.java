import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int f_idx = 0;
        int s_idx = 0;
        int t_idx = 0;
        
        int f_p = 0;
        int s_p = 0;
        int t_p = 0;
        
        for (int n : answers) {
            if (n == first[f_idx]) {
                f_p++;
            }
            if (n == second[s_idx]) {
                s_p++;
            }
            if (n == third[t_idx]) {
                t_p++;
            }
            
            if (f_idx+1 == first.length) {
                f_idx = 0;
            }
            else {
                f_idx++;
            }
            if (s_idx+1 == second.length) {
                s_idx = 0;
            }
            else {
                s_idx++;
            }
            if (t_idx+1 == third.length) {
                t_idx = 0;
            }
            else {
                t_idx++;
            }
        }
        
        int tmp = Math.max(f_p, s_p);
        int tmp2 = Math.max(t_p, tmp);
        
        if (tmp2 == f_p) {
            answer.add(1);
        }
        if (tmp2 == s_p) {
            answer.add(2);
        }
        if (tmp2 == t_p) {
            answer.add(3);
        }
        
        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}