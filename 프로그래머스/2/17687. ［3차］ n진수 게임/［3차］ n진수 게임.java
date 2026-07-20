class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        int turn = p;
        
        while (sb.length() < t) {
            String target = Integer.toString(num, n);
            
            if (target.length() < turn) {
                turn -= target.length();
            }
            else {
                while (turn <= target.length()) {
                    sb.append(target.charAt(turn-1));
                    if (sb.length() >= t) break;
                    turn += m;
                }
                turn -= target.length();
            }
            
            num++;
        }
        
        return sb.toString().toUpperCase();
    }
}