import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        Deque<Character> deque = new ArrayDeque<>();
        
        for(int i = 0; i < my_string.length(); i++){
            deque.addFirst(my_string.charAt(i));
        }
        for(int j = 0; j < my_string.length(); j++){
            answer += deque.removeFirst();
        }
        
        return answer;
    }
}