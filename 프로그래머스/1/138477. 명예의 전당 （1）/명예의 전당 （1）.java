import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int min = Integer.MAX_VALUE;
        
        for (int i = 0 ; i < score.length; i++) {
            if (i < k) {
                min = min > score[i] ? score[i] : min;
                answer[i] = min;
            }
            else {
                int[] arr = Arrays.copyOfRange(score, 0, i+1);
                Arrays.sort(arr);
                answer[i] = arr[arr.length-k];
            }
        }
        
        return answer;
    }
}