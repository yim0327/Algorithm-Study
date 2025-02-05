import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < num_list.length; i++){
            arr.add(num_list[i]);
        }
        
        for(int j = 0; j < n; j++){
            int tmp = arr.get(0);
            arr.remove(0);
            arr.add(tmp);
        }        
        
        
        int[] answer = new int[arr.size()];
        for(int k = 0; k < arr.size(); k++){
            answer[k] = arr.get(k);
        }
        
        return answer;
    }
}