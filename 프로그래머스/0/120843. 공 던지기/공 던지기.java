class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 0;

        for(int i = 0; i < k; i++){
            answer = numbers[idx];
            System.out.println(answer);
            if(idx + 2 >= numbers.length){
                if(idx == numbers.length-2){
                    idx = 0;
                }
                else if(idx == numbers.length-1){
                    idx = 1;
                }
            }
            else{
                idx += 2;
            }
        }
        return answer;
    }
}