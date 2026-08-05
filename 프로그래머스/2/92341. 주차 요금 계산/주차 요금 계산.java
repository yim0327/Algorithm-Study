import java.util.HashMap;
import java.util.TreeMap;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, String> map = new HashMap<>(); // 차량 번호, 입차 시각
        TreeMap<String, Integer> cmlt_time = new TreeMap<>(); // 누적 시간 기록
        
        for (String record : records) {
            String[] r_split = record.split(" ");
            
            if (map.containsKey(r_split[1])) { // 출차
                String[] inArr = map.get(r_split[1]).split(":");
                int in = Integer.parseInt(inArr[0]) * 60 + Integer.parseInt(inArr[1]);
                
                String[] outArr = r_split[0].split(":");
                int out = Integer.parseInt(outArr[0]) * 60 + Integer.parseInt(outArr[1]);
                
                int time = out - in;
                
                cmlt_time.put(r_split[1], cmlt_time.getOrDefault(r_split[1], 0) + time);
                map.remove(r_split[1]);
            }
            else { // 입차
                map.put(r_split[1], r_split[0]);
            }
        }
        
        // 출차 기록 없는 경우 (~23:59)
        if (!map.isEmpty()) {
            for (String key : map.keySet()) {
                String[] inArr = map.get(key).split(":");
                
                int in = Integer.parseInt(inArr[0]) * 60 + Integer.parseInt(inArr[1]);
                int out = 23 * 60 + 59;
                
                int time = out - in;
                
                cmlt_time.put(key, cmlt_time.getOrDefault(key, 0) + time);
            }
        }
        
        int[] answer = new int[cmlt_time.size()];
        int idx = 0;
        
        // 주차 요금 계산
        for (String key : cmlt_time.keySet()) {
            answer[idx] += fees[1]; // 기본 요금 부과
            
            if (cmlt_time.get(key) > fees[0]) { // 초과 요금 부과
                int t = cmlt_time.get(key) - fees[0];
                
                answer[idx] += t % fees[2] == 0 ? (t / fees[2]) * fees[3]
                    : (int)Math.ceil((float)t / fees[2]) * fees[3];                
            }
            
            idx++;
        }
        
        return answer;
    }
}