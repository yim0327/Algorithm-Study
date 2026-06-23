import java.util.Queue;
import java.util.ArrayDeque;

class Solution {
    public int solution(int[][] maps) {
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[] {0, 0}); // 행/열
            
        int[] dr = {0, 0, 1, -1}; // 행 변화
        int[] dc = {1, -1, 0, 0}; // 열 변화
        
        while (!q.isEmpty()) {
            int[] pos = q.poll();
            
            for (int i = 0; i < 4; i++) {
                int r = pos[0] + dr[i];
                int c = pos[1] + dc[i];
                
                if (r < 0 || r >= maps.length 
                    || c < 0 || c >= maps[0].length) {
                    continue; // 범위 외 일시 반복문 패스(계산x)
                }
                
                if (maps[r][c] == 1) {
                    maps[r][c] = maps[pos[0]][pos[1]] + 1; // 누적합
                    q.offer(new int[] {r, c});
                }
            }
        }
        
        return maps[maps.length-1][maps[0].length-1] == 1 
            ? -1 : maps[maps.length-1][maps[0].length-1];
    }
}