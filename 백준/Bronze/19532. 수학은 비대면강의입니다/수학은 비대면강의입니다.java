import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(s.nextToken());
        int b = Integer.parseInt(s.nextToken());
        int c = Integer.parseInt(s.nextToken());
        int d = Integer.parseInt(s.nextToken());
        int e = Integer.parseInt(s.nextToken());
        int f = Integer.parseInt(s.nextToken());

        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if (a*x + b*y == c && d*x + e*y == f) {
                    System.out.println(x + " " + y);
                    return;
                }
            }
        }
    }
}