import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1; i < 64; i++){ // i = 규칙과 맞아 떨어지는 이진수
            String bs = Integer.toBinaryString(i);
            int num = Integer.parseInt(bs) * 5; // 실제 비교를 위한 정수
            if(num >= l && num <= r){
                arr.add(num);
            }
        }

        if(arr.isEmpty()){
            arr.add(-1);
        }
        
        int[] answer = new int[arr.size()];
        
        for(int j = 0; j < arr.size(); j++){
            answer[j] = arr.get(j).intValue();
        }
        
        return answer;
    }
}