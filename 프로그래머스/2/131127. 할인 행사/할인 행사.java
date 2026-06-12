import java.util.HashMap;

class Solution {
    public int check(String[] want, int[] number, HashMap<String, Integer> map) {
        for (int i = 0; i < want.length; i++) {
            if (!map.containsKey(want[i])) return 0;
            else {
                if (map.get(want[i]) != number[i]) return 0;
            }
        }
        
        return 1;
    }
    
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int total = 0;
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < number.length; i++) {
            total += number[i];
        }
        
        for (int j = 0; j < total; j++) {
            if (map.containsKey(discount[j])) {
                map.put(discount[j], map.get(discount[j]) + 1);
            }
            else {
                map.put(discount[j], 1);
            }
        }
        
        answer += check(want, number, map);
        
        for (int k = 0; k < discount.length-total; k++) {
            if (map.get(discount[k]) != 0) {
                map.put(discount[k], map.get(discount[k]) - 1);
            }
            
            if (map.containsKey(discount[total+k])) {
                map.put(discount[total+k], map.get(discount[total+k]) + 1);
            }
            else {
                map.put(discount[total+k], 1);
            }
            
            answer += check(want, number, map);
        }
        
        return answer;
    }
}