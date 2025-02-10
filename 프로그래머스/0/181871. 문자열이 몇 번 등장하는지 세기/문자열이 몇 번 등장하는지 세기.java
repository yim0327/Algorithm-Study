class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int idx = myString.indexOf(pat);
        
        if(idx != -1){
            answer = 1;
        }
        
        while(idx != -1){
            myString = myString.substring(idx+1);
            idx = myString.indexOf(pat);
            if(idx != -1){
                answer++;
            }
        }
        
        return answer;
    }
}