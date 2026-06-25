class Solution {
    public int solution(String dirs) {
        int answer = 0;
        boolean[][] r_check = new boolean[11][10]; // 행 / 칸
        boolean[][] c_check = new boolean[11][10]; // 열 / 칸
        
        int[] pos = new int[] {5, 5};
        
        for (char d : dirs.toCharArray()) {
            int r = 0;
            int c = 0;
            
            // 좌표 계산
            if (d == 'U') {
                r = pos[0] + 1;
                c = pos[1];
            }
            else if (d == 'D') {
                r = pos[0] - 1;
                c = pos[1];
            }
            else if (d == 'L') {
                r = pos[0];
                c = pos[1] - 1;
            }
            else if (d == 'R') {
                r = pos[0];
                c = pos[1] + 1;
            }
            
            if (r < 0 || r >= 11 || c < 0 || c >= 11) continue;
            
            pos[0] = r;
            pos[1] = c;
            
            // 방문 여부 체크
            if (d == 'U' && !c_check[c][r-1]) {
                c_check[c][r-1] = true;
                answer++;
            }
            else if (d == 'D' && !c_check[c][r]) {
                c_check[c][r] = true;
                answer++;
            }
            else if (d == 'L' && !r_check[r][c]) {
                r_check[r][c] = true;
                answer++;
            }
            else if (d == 'R' && !r_check[r][c-1]) {
                r_check[r][c-1] = true;
                answer++;
            }
        }
        
        return answer;
    }
}