class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        
        for (int i = 1; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            String sub = s.substring(0, i);
            if (sub.lastIndexOf(c) == -1) answer[i] = -1;
            else answer[i] = i - sub.lastIndexOf(c);
        }
        
        return answer;
    }
}