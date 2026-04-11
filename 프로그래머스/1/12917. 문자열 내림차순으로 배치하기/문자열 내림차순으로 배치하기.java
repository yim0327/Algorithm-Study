import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}