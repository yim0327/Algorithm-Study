class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a = sides[0] > sides[1] ? sides[1] : sides[0]; // 작은변
        int b = sides[0] > sides[1] ? sides[0] : sides[1]; // 큰변
        
        for(int i = 1; i <= b; i++) { // b가 가장 길 때
            if(a + i > b){
                answer++;
            }
        }
        
        for(int j = b+1; j <= a+b; j++){ // x가 가장 길 때
            if(a + b > j){
                answer++;
            }
        }
        
        return answer;
    }
}
