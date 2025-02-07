class Solution {
    public int solution(int n) {
        int answer = 0;
        int fac = 1;
        
        for(int i = 1; i <= 10; i++){
            fac *= i;
            
            if(fac*(i+1) > n || fac*i == n || i == 10){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}