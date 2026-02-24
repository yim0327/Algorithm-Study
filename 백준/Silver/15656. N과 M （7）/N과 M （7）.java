import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    private static void combination(int[] arr, int[] out, int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                sb.append(out[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            out[depth] = arr[i];
            combination(arr, out, depth + 1, r);
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

        combination(arr, new int[r], 0, r);

        System.out.print(sb.toString());
    }
}