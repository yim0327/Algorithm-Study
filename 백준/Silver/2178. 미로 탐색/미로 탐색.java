import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    private static void bfs(int n, int m, int[][] map, int[][] dist, Queue<int[]> queue) {
        queue.offer(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] currentNode = queue.poll();
            int r = currentNode[0];
            int c = currentNode[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr < 0 || nr >= n || nc < 0 || nc >= m) {
                    continue;
                }
                if (map[nr][nc] == 0) {
                    continue;
                }
                if (dist[nr][nc] != 0) {
                    continue;
                }

                dist[nr][nc] = dist[r][c] + 1;
                queue.offer(new int[]{nr, nc});
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken());
        int m = Integer.parseInt(s.nextToken());

        int[][] map = new int[n][m];
        int[][] dist = new int[n][m];
        dist[0][0] = 1;

        for (int i = 0; i < n; i++) {
            String line = br.readLine();

            for (int j = 0; j < m; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(n, m, map, dist, new ArrayDeque<>());

        System.out.println(dist[n-1][m-1]);
    }
}