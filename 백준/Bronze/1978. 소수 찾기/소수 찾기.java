import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken());
        int answer = 0;

        s = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(s.nextToken());
            int cnt = 0;

            for (int j = 1; j <= x; j++) {
                if (x % j ==0) cnt++;
            }

            if (cnt == 2) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}