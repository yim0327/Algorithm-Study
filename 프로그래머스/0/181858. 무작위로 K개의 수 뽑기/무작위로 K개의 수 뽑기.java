import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        answer[0] = arr[0];
        int idx = 1;
        boolean check = false;
        
        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < k; j++){
                if(arr[i] == answer[j]){
                    check = true;
                    break;
                }
            }
            
            if(check == false){
                answer[idx] = arr[i];
                idx++;
            }
            
            if(idx >= k){
                break;
            }
            
            check = false;
        }
        
        return answer;
    }
}