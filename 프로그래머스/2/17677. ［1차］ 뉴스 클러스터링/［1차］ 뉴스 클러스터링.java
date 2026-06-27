import java.util.HashMap;
import java.util.HashSet;

class Solution {
    private HashMap<String, Integer> makeMap(String str) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 2; i <= str.length(); i++) {
            String word = str.substring(i-2, i).toLowerCase();
            if (!word.matches("[a-z]+")) continue;
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        return map;
    }
    
    public int solution(String str1, String str2) {
        int answer = 65536;

        HashMap<String, Integer> map1 = makeMap(str1);
        HashMap<String, Integer> map2 = makeMap(str2);

        int union = 0;
        int intersection = 0;

        HashSet<String> keys = new HashSet<>(map1.keySet());
        keys.addAll(map2.keySet());

        for (String key : keys) {
            int count1 = map1.getOrDefault(key, 0);
            int count2 = map2.getOrDefault(key, 0);

            intersection += Math.min(count1, count2);
            union += Math.max(count1, count2);
        }

        if (union == 0) return answer;

        answer *= (double) intersection / union;

        return answer;
    }
}