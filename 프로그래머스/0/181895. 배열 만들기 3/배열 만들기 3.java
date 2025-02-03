import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int[intervals[1][1] - intervals[1][0]
                              + intervals[0][1] - intervals[0][0] + 2];
        int idx = 0;
        
        for(int i = 0; i < 2; i++){
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
                answer[idx] = (arr[j]);
                idx++;
            }
        }
        
        return answer;
    }
}