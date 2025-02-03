import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = intervals[0][0]; i <= intervals[0][1]; i++){
            list.add(arr[i]);
        }
        for(int j = intervals[1][0]; j <= intervals[1][1]; j++){
            list.add(arr[j]);
        }
        
        int[] answer = new int[list.size()];
        for(int k = 0; k < list.size(); k++){
            answer[k] = list.get(k);
        }
        
        return answer;
    }
}