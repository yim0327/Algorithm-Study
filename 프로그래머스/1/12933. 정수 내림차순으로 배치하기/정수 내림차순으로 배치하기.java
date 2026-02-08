import java.util.*;

class Solution {
    public long solution(long n) {
        String num = Long.toString(n);
        String[] arr = num.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        return Long.parseLong(String.join("", arr));
    }
}