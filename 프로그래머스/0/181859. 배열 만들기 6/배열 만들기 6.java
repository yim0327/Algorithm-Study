import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(stk.isEmpty()){
                stk.add(arr[i]);
            }
            else if(stk.get(stk.size()-1) == arr[i]){
                stk.remove(stk.size()-1);
            }
            else if(stk.get(stk.size()-1) != arr[i]){
                stk.add(arr[i]);
            }
        }
        
        if(stk.isEmpty()){
            stk.add(-1);
        }
        
        int[] answer = new int[stk.size()];
        for(int j = 0; j < stk.size(); j++){
            answer[j] = stk.get(j);
        }
        
        return answer;
    }
}