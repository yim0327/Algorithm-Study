import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split("\\D+");
        
        return Arrays.stream(arr)
                    .filter(s-> !s.isEmpty())
                    .mapToInt(Integer::parseInt)
                    .sum();
    }
}