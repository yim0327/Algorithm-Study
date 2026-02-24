import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    private static void repeatedPermutation(int[] out, int depth, int n, int r) {
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                sb.append(out[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < n; i++) {
            out[depth] = i+1;
            repeatedPermutation(out, depth+1, n, r);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken());
        int r = Integer.parseInt(s.nextToken());

        repeatedPermutation(new int[r], 0, n, r);

        System.out.print(sb.toString());
    }
}