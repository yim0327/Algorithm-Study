import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static void combination(int[] arr, int start, int[] out, int depth, int r) {
        if (depth == r) {
            for (int x : out) System.out.print(x + " ");
            System.out.println();
            return;
        }

        for (int i = start; i < arr.length; i++) {
            out[depth] = arr[i];
            combination(arr, i + 1, out, depth+1, r);
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

        combination(arr, 0, new int[r], 0, r);

    }
}