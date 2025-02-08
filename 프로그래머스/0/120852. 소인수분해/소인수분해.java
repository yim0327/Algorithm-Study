import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int div = 2;
        
        while(n > 1){
            if(n % div == 0){
                n /= div;
                arr.add(div);
            }
            else{
                div++;
            }
        }
        
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i-1) == arr.get(i)){
                arr.remove(i);
                i--;
            }
        }
        
        int[] answer = new int[arr.size()];
        for(int j = 0; j < arr.size(); j++){
            answer[j] = arr.get(j);
        }
        
        return answer;
    }
}