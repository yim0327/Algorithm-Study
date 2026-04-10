import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int tmp = arr[0];
        
        if (arr.length == 1) return new int[] {-1};
        
        for (int i = 1; i < arr.length; i++) {
            tmp = Math.min(tmp, arr[i]);
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != tmp) list.add(arr[i]);
        }
        
        return list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}