import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String msg) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        // 사전 초기화
        for (int i = 0; i < 26; i++) {
            char c = (char)('A' + i);
            map.put(String.valueOf(c), i+1);
        }
        
        int idx = 0;
        
        while (idx < msg.length()) {
            StringBuilder w = new StringBuilder(msg.substring(idx));
            
            // 1. w로 시작하는 가장 긴 단어부터 확인
            while (w.length() > 0) {
                if (map.containsKey(w.toString())) {
                    result.add(map.get(w.toString())); // 2. 있으면 리스트에 색인 추가
                    break;
                }
                
                w.delete(w.length()-1, w.length()); // 없으면 다음으로 긴 단어로 이동
            }
            
            int len = w.length();
                        
            // 3. 사전에 w+c 색인 추가
            if (idx + len < msg.length()) {
                w.append(msg.charAt(idx+len));
                map.put(w.toString(), map.size()+1);
            }
            
            idx += len;
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}