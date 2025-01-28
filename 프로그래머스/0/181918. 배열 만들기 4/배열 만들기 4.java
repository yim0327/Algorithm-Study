import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> s = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(s.size() == 0){ // 1. 빈 배열
                s.add(arr[i]);
            }
            else{
                if(s.get(s.size()-1) < arr[i]){ // 2. 값 있고 작을 때
                    s.add(arr[i]);
                }
                else{ // 3. 값 있고 크거나 같을 때
                    s.remove(s.size()-1);
                    i--;
                }
            }
        } 
        
        int[] stk = new int[s.size()];
        for(int j = 0; j < s.size(); j++){
            stk[j] = s.get(j).intValue();
        }
        
        return stk;
    }
}