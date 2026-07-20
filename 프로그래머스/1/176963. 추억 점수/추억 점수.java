import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> score = new HashMap<>();
        
        for (int i = 0; i < name.length; i++) score.put(name[i], yearning[i]);
        
        for (int j = 0; j < photo.length; j++) {
            int count = 0;
            String[] p = photo[j];
            
            for (int k = 0; k < p.length; k++) {
                if (score.containsKey(p[k])) count += score.get(p[k]);
            }
            
            answer[j] = count;
        }
        
        return answer;
    }
}