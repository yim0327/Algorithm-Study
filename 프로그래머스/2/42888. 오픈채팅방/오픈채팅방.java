import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> nick = new HashMap<>();
        List<String[]> seq = new ArrayList<>(); // uid, type
        
        for (String r : record) {
            String[] arr = r.split(" ");
            
            if (arr[0].equals("Leave")) {
                seq.add(new String[] {"out", arr[1]});
            }
            else {
                nick.put(arr[1], arr[2]);
                
                if (arr[0].equals("Enter")) {
                    seq.add(new String[] {"in", arr[1]});
                }
            }
        }
        
        String[] answer = new String[seq.size()];
        
        for (int i = 0; i < seq.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(nick.get(seq.get(i)[1]));
            
            if (seq.get(i)[0].equals("in")) sb.append("님이 들어왔습니다.");
            else sb.append("님이 나갔습니다.");
            
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}