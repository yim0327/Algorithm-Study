class Solution {
    public String solution(String myString, String pat) {        
        StringBuilder sb = new StringBuilder(myString);
        String st = sb.reverse().toString();
        
        sb = new StringBuilder(pat);
        String p = sb.reverse().toString();
        
        String answer = st.substring(st.indexOf(p), st.length());
        sb = new StringBuilder(answer);
        answer = sb.reverse().toString();
        
        return answer;
    }
}