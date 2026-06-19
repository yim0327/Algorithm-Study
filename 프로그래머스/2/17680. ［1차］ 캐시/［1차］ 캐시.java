import java.util.ArrayDeque;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayDeque<String> queue = new ArrayDeque<>(cacheSize);
        
        if (cacheSize == 0) return cities.length * 5;
        
        for (int i = 0; i < cities.length; i++) {
            String s = cities[i].toLowerCase();
            
            if (queue.isEmpty()) {
                answer += 5;
            }
            else {
                if (queue.contains(s)) {
                    queue.remove(s);
                    answer += 1;
                }
                else {
                    if (queue.size() == cacheSize) queue.remove();
                    answer += 5;
                }
            }
            
            queue.add(s);
        }
                
        return answer;
    }
}