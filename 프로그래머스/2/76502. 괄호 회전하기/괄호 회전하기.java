import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            
            for (int j = 0; j < s.length(); j++) {
                if (sb.charAt(j) == '[' || sb.charAt(j) == '{' || sb.charAt(j) == '(') {
                    stack.push(sb.charAt(j));
                }
                else {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    }
                    
                    if (sb.charAt(j) == ']' && stack.peek() == '[') stack.pop();
                    else if (sb.charAt(j) == '}' && stack.peek() == '{') stack.pop();
                    else if (sb.charAt(j) == ')' && stack.peek() == '(') stack.pop();
                }
            }
            
            if (flag && stack.isEmpty()) answer++;
            
            sb.insert(sb.length(), sb.charAt(0));
            sb.deleteCharAt(0);
        }
        
        return answer;
    }
}