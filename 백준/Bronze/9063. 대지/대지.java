import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken());

        int[] arr = new int[4];

        for (int i = 0; i < n; i++) {
            s = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(s.nextToken());
            int y = Integer.parseInt(s.nextToken());

            if (n == 1) break;

            if (i == 0) {
                arr[0] = arr[1] = x;
                arr[2] = arr[3] = y;
            }

            arr[0] = Math.max(arr[0], x);
            arr[2] = Math.max(arr[2], y);
            arr[1] = Math.min(arr[1], x);
            arr[3] = Math.min(arr[3], y);
        }

        if (n == 1) System.out.println(0);
        else System.out.println((arr[0]-arr[1])*(arr[2]-arr[3]));
    }
}