import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : arr){
            for(int j = 0; j < i; j++){
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int k = 0; k < list.size(); k++){
            answer[k] = list.get(k);
        }
        
        return answer;
    }
}