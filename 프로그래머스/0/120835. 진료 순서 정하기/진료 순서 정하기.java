class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int num = 1;
        
        for(int i = 0; i < emergency.length; i++){
            int max = 0;
            int tmp = 0;
            for(int j = 0; j < emergency.length; j++){
                if(emergency[j] > max){
                    max = emergency[j];
                    tmp = j;
                }
            }
            emergency[tmp] = 0;
            answer[tmp] = num;
            num++;
        }  
        
        return answer;
    }
}