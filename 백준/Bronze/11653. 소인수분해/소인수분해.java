import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static void solution(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);

                solution(n/i);
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        solution(n);
    }
}