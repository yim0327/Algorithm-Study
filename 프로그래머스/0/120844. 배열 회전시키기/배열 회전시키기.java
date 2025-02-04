import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++){
            arr.add(numbers[i]);
        }
        
        int tmp = 0;
        
        if(direction.equals("left")){
            tmp = arr.get(0);
            arr.remove(0);
            arr.add(tmp);
        }
        else{
            tmp = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            arr.add(0, tmp);
        }
        
        int[] answer = new int[arr.size()];
        for(int j = 0; j < arr.size(); j++){
            answer[j] = arr.get(j);
        }
        
        return answer;
    }
}