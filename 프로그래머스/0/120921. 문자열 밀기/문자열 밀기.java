class Solution {
    public int solution(String A, String B) {
        String tmpB = B.repeat(2);
        return tmpB.indexOf(A);
    }
}