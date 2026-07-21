import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int total = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int t : tangerine) map.put(t, map.getOrDefault(t, 0) + 1);
        
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        
        for (int i : list) {
            total += i;
            answer++;
            if (total >= k) break;
        }
        
        return answer;
    }
}