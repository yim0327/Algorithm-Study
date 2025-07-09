import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        float[] mean = new float[score.length];
        
        for(int i = 0; i < score.length; i++){
            mean[i] = ((float)score[i][0] + (float)score[i][1])/2;
        }
        
        float[] sorted = Arrays.copyOf(mean, mean.length);
        Arrays.sort(sorted);
        
        for(int j = 0; j < mean.length; j++){
            for(int k = mean.length - 1; k >= 0; k--){       
                if(mean[j] == sorted[k]){
                    answer[j] = (int)(mean.length - k);
                    break;
                }
            }
        }
        
        return answer;
    }
}