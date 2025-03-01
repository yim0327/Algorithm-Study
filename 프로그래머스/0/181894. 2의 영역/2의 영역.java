import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {0};
        int idx1 = -1;
        int idx2 = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                idx1 = i;
                break;
            }
        }
        
        if(idx1 == -1){
            answer[0] = -1;
        }
        else{
            for(int j = arr.length-1; j > idx1; j--){
                if(arr[j] == 2){
                    idx2 = j;
                    break;
                }
            }
            
            if(idx2 == -1){
                answer[0] = 2;
            }
            else{
                return Arrays.copyOfRange(arr, idx1, idx2+1);
            }
        }
        
        return answer;
    }
}