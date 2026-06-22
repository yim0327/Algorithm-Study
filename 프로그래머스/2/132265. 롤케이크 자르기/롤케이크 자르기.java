import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for (int t : topping) {
            if (map.containsKey(t)) map.put(t, map.get(t) + 1);
            else map.put(t, 1);
        }
        
        for (int t : topping) {
            set.add(t);
            map.put(t, map.get(t) - 1);
            
            if (map.get(t) == 0) map.remove(t);
            
            if (map.size() == set.size()) answer++;
        }
        
        return answer;
    }
}