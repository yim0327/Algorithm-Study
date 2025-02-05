import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {       
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < num_list.length; i+= n){
            arr.add(num_list[i]);
        }
        
        int[] answer = new int[arr.size()];
        for(int j = 0; j < arr.size(); j++){
            answer[j] = arr.get(j);
        }
        
        return answer;
    }
}