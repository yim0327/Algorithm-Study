import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int[] tmp : score){
            arr.add(tmp[0]+tmp[1]);
        }
        
        arr.sort(Collections.reverseOrder());
        
        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++){
            answer[i] = arr.indexOf(score[i][0]+score[i][1])+1;
        }
        
        return answer;
    }
}