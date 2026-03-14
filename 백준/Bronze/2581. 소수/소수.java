import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 0;

        for (int i = m; i <= n; i++) {
            int cnt = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) cnt++;
            }

            if (cnt == 2) {
                if (sum == 0) {
                    min = i;
                }

                sum += i;
            }
        }

        if (sum == 0) System.out.print("-1");
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}