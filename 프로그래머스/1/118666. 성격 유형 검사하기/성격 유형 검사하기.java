import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("R", 0); map.put("T", 0);
        map.put("C", 0); map.put("F", 0);
        map.put("J", 0); map.put("M", 0);
        map.put("A", 0); map.put("N", 0);
        
        for (int i = 0; i < survey.length; i++) {
            String s = survey[i];
            
            if (choices[i] == 1 || choices[i] == 2 
                || choices[i] == 3) {
                int point = 4 - choices[i];
                String type = String.valueOf(s.charAt(0));
                map.put(type, map.get(type) + point);
            }
            else if ((choices[i] == 5 || choices[i] == 6 
                      || choices[i] == 7)) {
                int point = choices[i] - 4;
                String type = String.valueOf(s.charAt(1));
                map.put(type, map.get(type) + point);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(
            Math.max(map.get("R"), map.get("T")) 
            == map.get("R") ? "R" : "T"
        );
        sb.append(
            Math.max(map.get("C"), map.get("F")) 
            == map.get("C") ? "C" : "F"
        );
        sb.append(
            Math.max(map.get("J"), map.get("M")) 
            == map.get("J") ? "J" : "M"
        );
        sb.append(
            Math.max(map.get("A"), map.get("N")) 
            == map.get("A") ? "A" : "N"
        );
        
        return sb.toString();
    }
}