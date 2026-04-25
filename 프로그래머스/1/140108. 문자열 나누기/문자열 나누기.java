class Solution {
    public int solution(String s) {
        int answer = 0;
        char first = s.charAt(0);
        
        int f = 0;
        int o = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == first) f++;
            else o++;
            
            if (f == o) {
                answer++;
                if (i+1 < s.length()) first = s.charAt(i+1);
                f = 0;
                o = 0;
            }
            
            if (i == s.length()-1 && f!= o) answer++;
        }
        
        return answer;
    }
}