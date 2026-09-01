import java.util.Queue;
import java.util.ArrayDeque;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        if (n == 1 && m == 1) {
            return 1;
        }

        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, 0});

        int[] dr = {0, 0, 1, -1};
        int[] dc = {1, -1, 0, 0};

        while (!q.isEmpty()) {
            int[] pos = q.poll();

            for (int i = 0; i < 4; i++) {
                int r = pos[0] + dr[i];
                int c = pos[1] + dc[i];

                if (r < 0 || r >= n || c < 0 || c >= m) {
                    continue;
                }

                if (maps[r][c] != 1) {
                    continue;
                }

                maps[r][c] = maps[pos[0]][pos[1]] + 1;

                if (r == n - 1 && c == m - 1) {
                    return maps[r][c];
                }

                q.offer(new int[]{r, c});
            }
        }

        return -1;
    }
}