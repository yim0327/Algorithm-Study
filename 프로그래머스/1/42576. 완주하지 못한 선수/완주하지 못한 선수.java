import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        StringBuilder answer = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String p : participant) map.put(p, map.getOrDefault(p, 0) + 1);
        
        for (String c : completion) {
            map.put(c, map.get(c)-1);
            if (map.get(c) == 0) map.remove(c);
        }
        
        for (String key : map.keySet()) answer.append(key);
        
        return answer.toString();
    }
}