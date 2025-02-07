class Solution {
    public int solution(int[] numbers) {
        int f = 0;
        int s = 0;
        
        for(int i = 0; i < numbers.length; i++){
            if(f < numbers[i]){
                s = f;
                f = numbers[i];
            }
            else if(f >= numbers[i] && s < numbers[i]){
                s = numbers[i];
            }
        }
        
        return f*s;
    }
}