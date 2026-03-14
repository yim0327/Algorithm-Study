import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(s.nextToken());

            if (n == -1) break;

            int value = 0;
            String str = "";

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    value += i;

                    if (str.isEmpty()) {
                        str = n + " = " + i;
                    }
                    else {
                        str += " + " + i;
                    }
                }
            }

            if (value != n) {
                str = n + " is NOT perfect.";
            }

            sb.append(str).append("\n");
        }

        System.out.print(sb.toString());
    }
}