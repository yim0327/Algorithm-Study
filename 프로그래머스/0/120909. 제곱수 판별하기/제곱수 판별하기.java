import java.lang.Math;

class Solution {
    public int solution(int n) {
        return (int)Math.pow((int)Math.sqrt(n), 2) == n ? 1 : 2;
    }
}