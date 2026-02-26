import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    private static void dfs(int node, boolean[] visited, ArrayList<Integer>[] graph) {
        visited[node] = true;
        sb.append(node).append(' ');
        
        for (int n : graph[node]) {
            if (!visited[n]) {
                dfs(n, visited, graph);
            }
        }
    }

    private static void bfs(int node, Queue<Integer> queue, boolean[] visited, ArrayList<Integer>[] graph) {
        visited[node] = true;
        sb.append(node).append(' ');

        queue.offer(node);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            
            for (int n : graph[currentNode]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.offer(n);
                    sb.append(n).append(' ');
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken());
        int m = Integer.parseInt(s.nextToken());
        int v = Integer.parseInt(s.nextToken());

        ArrayList<Integer>[] graph = new ArrayList[n+1];

        for (int i = 1; i < n+1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            s = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(s.nextToken());
            int b = Integer.parseInt(s.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i < n+1; i++) {
            Collections.sort(graph[i]);
        }

        dfs(v, new boolean[n+1], graph);
        sb.append('\n');
        bfs(v, new LinkedList<>(), new boolean[n+1], graph);

        System.out.println(sb.toString());

    }
}