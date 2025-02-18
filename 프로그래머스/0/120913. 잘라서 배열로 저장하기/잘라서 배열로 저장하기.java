class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length()%n == 0 ? my_str.length()/n : my_str.length()/n+1;
        String[] answer = new String[len];        
        
        for(int i = 0; i < len; i++){
            int a = n * i;
            int b = ( a+n >= my_str.length() ? my_str.length() : a+n );
            answer[i] = my_str.substring(a, b);
        }
        
        return answer;
    }
}