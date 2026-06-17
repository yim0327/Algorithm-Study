import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> type = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            if (type.containsKey(clothes[i][1])) {
                type.put(clothes[i][1], type.get(clothes[i][1]) + 1);
            }
            else {
                type.put(clothes[i][1], 1);
            }
        }
        
        int sum = 0;
        
        for (int n : type.values()) {
            sum += n;
            answer *= (n+1);
        }
        
        return --answer;
    }
}