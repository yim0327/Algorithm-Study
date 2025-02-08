import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                arr.add(i);
                while(n % i == 0){
                    n /= i;
                }
            }
        }
        
        int[] answer = new int[arr.size()];
        for(int j = 0; j < arr.size(); j++){
            answer[j] = arr.get(j);
        }
        
        return answer;
    }
}