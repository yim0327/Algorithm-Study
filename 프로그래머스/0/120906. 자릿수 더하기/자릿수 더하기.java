class Solution {
    public int solution(int n) {
        int answer = 0;
        String st = String.valueOf(n);
        
        for(int i = 0; i < st.length(); i++){
            answer += Integer.parseInt(String.valueOf(st.charAt(i)));
        }
        
        return answer;
    }
}