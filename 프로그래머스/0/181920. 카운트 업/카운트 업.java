import java.util.ArrayList;

class Solution {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        int i = start_num;
        while(i <= end_num){
            arr.add(i);
            i++;
        }
        
        int[] answer = new int[arr.size()];
        for(int p = 0; p < arr.size(); p++){
            answer[p] = arr.get(p).intValue();
        }
            
        return answer;
    }
}