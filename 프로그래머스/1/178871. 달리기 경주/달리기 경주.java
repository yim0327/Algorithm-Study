import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>(players.length);
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String call : callings) {
            int idx = map.get(call).intValue();
            
            String tmp = players[idx-1];
            players[idx-1] = players[idx];
            players[idx] = tmp;
            
            map.put(call, idx - 1);
            map.put(tmp, idx);
        }
        
        return players;
    }
}