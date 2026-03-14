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
            int a = Integer.parseInt(s.nextToken());
            int b = Integer.parseInt(s.nextToken());

            if (a == 0 && b == 0) break;

            if (a % b == 0) {
                sb.append("multiple");
            }
            else if (b % a == 0) {
                sb.append("factor");
            }
            else {
                sb.append("neither");
            }

            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}