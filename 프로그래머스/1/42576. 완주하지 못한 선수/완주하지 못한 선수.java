import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap();
        
        for (String s : participant) {
            if (map.containsKey(s)) {
                map.replace(s, map.get(s) + 1);
            }
            else {
                map.put(s, 1);
            }
        }
        
        for (String c : completion) {
            map.replace(c, map.get(c) - 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return answer;
    }
}