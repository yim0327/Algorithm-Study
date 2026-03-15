import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        long n = Long.parseLong(s.nextToken());
        System.out.println(4 * n);
    }
}

// 윗변 1
// 밑변 n
// 높이 n * 2
// 중간 n - 1