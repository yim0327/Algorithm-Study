class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        String[] m = my_string.split("");
        
        for(int i = 0; i < my_string.length(); i++){
            if(m[i].equals(letter)){
                m[i] = "";
            }
        }
        
        for(int j = 0; j < my_string.length(); j++){
            answer += m[j];
        }
        
        return answer;
    }
}