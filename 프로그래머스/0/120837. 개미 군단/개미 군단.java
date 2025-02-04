class Solution {
    public int solution(int hp) {
        int answer = 0;
        int ant = 5;
        
        for(int i = 0; i < 3; i++){
            if(hp != 0){
                answer += hp / ant;
                hp = hp % ant;
                ant -= 2;
            }
        }
        
        return answer;
    }
}