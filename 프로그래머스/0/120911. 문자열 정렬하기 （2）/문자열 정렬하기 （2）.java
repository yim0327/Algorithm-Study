import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String[] tmp = my_string.toLowerCase().split("");
        Arrays.sort(tmp);
        return String.join("", tmp);
    }
}