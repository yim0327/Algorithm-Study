import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();                              
        for (int a : arr) {
            if (a % divisor == 0) list.add(a);
        }
        
        if (list.isEmpty()) list.add(-1);
        
        int[] answer = list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
}