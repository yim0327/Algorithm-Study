class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        String[] st = my_string.split("");
        
        for(int i = 0; i < my_string.length(); i++){
            answer += st[i].repeat(n);
        }
            
        return answer;
    }
}