import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < intStrs.length; i++){
            String tmp = "";
            
            for(int j = s; j < l + s; j++){
                tmp += intStrs[i].charAt(j);
            }
            int Convert = Integer.parseInt(tmp);
            if(Convert > k){
                arr.add(Convert);
            }
        }
        
        int[] answer = new int[arr.size()];
        
        for(int p = 0; p < arr.size(); p++){
           answer[p] = arr.get(p);
        }
        
        return answer;
    }
}