import java.util.stream.Stream;

class Solution {
    public int solution(String num_str) {
        return Stream.of(num_str.split("")).mapToInt(Integer::parseInt).sum();
    }
}