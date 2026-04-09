class Solution {
    public String solution(String s) {
        String answer = "";
        
        int half = (int)s.length() / 2;
        
        if (s.length() % 2 == 0) {
            answer = s.substring(half-1, half+1);
        }
        else {
            answer =  s.substring(half, half+1);
        }
        
        return answer;
    }
}