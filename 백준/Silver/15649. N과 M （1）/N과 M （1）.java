import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static void permutation(int[] arr, int[] out, boolean[] visited, int depth, int m) {
        if (depth == m) {
            for (int n : out) System.out.print(n + " ");
            System.out.println();
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                out[depth] = arr[i];

                permutation(arr, out, visited, depth+1, m);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken());
        int m = Integer.parseInt(s.nextToken());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        permutation(arr, new int[m], new boolean[arr.length], 0, m);

    }
}