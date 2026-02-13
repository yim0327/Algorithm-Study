import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            .sorted((a, b) -> (b+a).compareTo(a+b))
            .toArray(String[]::new);
        
        if (arr[0].charAt(0) == '0') {
            return "0";
        } 
        
        return String.join("", arr);
    }
}
