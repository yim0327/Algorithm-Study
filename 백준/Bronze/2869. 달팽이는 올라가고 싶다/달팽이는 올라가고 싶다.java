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
        int v = Integer.parseInt(s.nextToken());

        int day;

        // 마지막 날 전날: 최소 높이 v-a
        // 일당 이동량: a-b
        day = (int) Math.ceil((double) (v - a) / (a-b));

        // 전날 기준 +a 또는 +a-b로 정상 도달 (+1일)
        System.out.println(day + 1);
    }
}