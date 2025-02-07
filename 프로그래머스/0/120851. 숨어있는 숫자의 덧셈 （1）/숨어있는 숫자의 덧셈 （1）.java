class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]", "");
        
        for(char ch : my_string.toCharArray()){
            answer += ch - '0';
        }
        
        return answer;
    }
}