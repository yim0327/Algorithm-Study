import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    private static void repeatedCombination(int[] arr, int[] out, int start, int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                sb.append(out[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = start; i < arr.length; i++) {
            out[depth] = arr[i];
            repeatedCombination(arr, out, i, depth+1, r);
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

        repeatedCombination(arr, new int[r], 0, 0, r);

        System.out.print(sb.toString());
    }
}