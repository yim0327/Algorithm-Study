class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 0; i < n; i++){
            answer += i;
            i++;
        }
        if(n % 2 == 0){
            answer += n;
        }
        
        return answer;
    }
}