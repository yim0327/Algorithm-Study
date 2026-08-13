class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        
        for (int[] s : sizes) {
            w = Math.max(w, Math.max(s[0], s[1]));
            h = Math.max(h, Math.min(s[0], s[1]));
        }
        
        return w * h;
    }
}