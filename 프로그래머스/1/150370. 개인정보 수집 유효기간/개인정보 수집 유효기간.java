import java.time.*;
import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> result = new ArrayList<>();
        
        today = today.replace(".", "-");
        LocalDate tooday = LocalDate.parse(today); // 현재 날짜
        
        // 약관 별 기간 세팅
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String s : terms) {
            String[] tmp = s.split(" ");
            Integer date = Integer.parseInt(tmp[1]);
            
            map.put(tmp[0], date);
        }
        
        // 개인정보 탐색
        for (int i = 0; i < privacies.length; i++) {
            String[] tmp = privacies[i].split(" ");
            
            tmp[0] = tmp[0].replace(".", "-");
            LocalDate d = LocalDate.parse(tmp[0]);
            d = d.plusMonths(map.get(tmp[1])); // 개인정보 + 약관 기간
            
            if (!d.isAfter(tooday)) result.add(i+1);
        }
        
        return result.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}