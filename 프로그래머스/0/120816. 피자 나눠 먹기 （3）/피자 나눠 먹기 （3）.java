class Solution {
    public int solution(double slice, double n) {
        int answer = 0;
        double div = n/slice;
        
        while(answer < div){
            answer++;
        }
            
        return answer;
    }
}