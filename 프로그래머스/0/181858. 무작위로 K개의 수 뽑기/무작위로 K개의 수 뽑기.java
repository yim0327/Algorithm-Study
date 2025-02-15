import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int n : arr){
            if(!list.contains(n)){
                list.add(n);
            }
            if(list.size() == k){
                break;
            }
        }
        
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        for(int i = 0; i < k && i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}