import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static void permutation(int[] arr, int start, int[] out, int depth, int n, int r) {
        if (depth == r) {
            for (int x : out) System.out.print(x + " ");
            System.out.println();
            return;
        }

        for (int i = start; i < n; i++) {
            out[depth] = arr[i];
            permutation(arr, i + 1, out, depth+1, n, r);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken());
        int r = Integer.parseInt(s.nextToken());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        permutation(arr, 0, new int[r], 0, n, r);

    }
}