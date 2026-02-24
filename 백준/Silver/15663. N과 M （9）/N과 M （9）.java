import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    private static void permutation(int[] arr, int[] out, boolean[] visited, int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                sb.append(out[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        int prev = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            if (arr[i] == prev) continue;
            prev = arr[i];

            visited[i] = true;
            out[depth] = arr[i];

            permutation(arr, out, visited, depth + 1, r);
            visited[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken());
        int r = Integer.parseInt(s.nextToken());

        s = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s.nextToken());
        }

        Arrays.sort(arr);

        permutation(arr, new int[r], new boolean[n], 0, r);

        System.out.print(sb.toString());
    }
}