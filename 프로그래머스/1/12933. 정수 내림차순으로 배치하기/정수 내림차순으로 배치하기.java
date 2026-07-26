import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        String[] arr = s.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        return Long.parseLong(String.join("", arr));
    }
}