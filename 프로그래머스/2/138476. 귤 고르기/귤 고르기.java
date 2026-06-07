import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int total = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : tangerine) {
            if (map.containsKey(i)) {
                int cnt = map.get(i) + 1;
                map.put(i, cnt);
            }
            else {
                map.put(i, 1);
            }
        }
                
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());

        for (int i : list) {
            total += i;
            answer++;
            if (k <= total) break;
        }
        
        return answer;
    }
}