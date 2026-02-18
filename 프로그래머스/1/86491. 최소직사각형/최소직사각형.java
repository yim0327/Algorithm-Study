class Solution {
    public int solution(int[][] sizes) {
        int x = 0;
        int y = 0;
        
        for (int[] s : sizes) {
            if (s[0] > s[1]) {
                x = x < s[0] ? s[0] : x;
                y = y < s[1] ? s[1] : y;
            }
            else {
                x = x < s[1] ? s[1] : x;
                y = y < s[0] ? s[0] : y;
            }
        }
        
        return x*y;
    }
}
