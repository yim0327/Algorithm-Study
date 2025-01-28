import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            if(stk.empty() == true){
                stk.push(arr[i]);
            }
            else{
                if(stk.peek() < arr[i]){
                    stk.push(arr[i]);
                }
                else{
                    stk.pop();
                    i--;
                }
            }
        }
        
        int[] result = new int[stk.size()];
        for(int j = stk.size() - 1; j >= 0; j--){
            result[j] = stk.pop();
        }
        
        return result;
    }
}