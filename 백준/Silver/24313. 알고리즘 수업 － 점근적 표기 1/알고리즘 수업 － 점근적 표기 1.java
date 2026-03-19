import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int a_1 = Integer.parseInt(s.nextToken());
        int a_0 = Integer.parseInt(s.nextToken());

        int c = Integer.parseInt(br.readLine());
        int n_0 = Integer.parseInt(br.readLine());

        int ans = 0;
        
        // a1 = c일 때, 좌변 0 -> a0 <= 0
        // a1 < c일 때. (c-a1) = 양수, n = 양수 -> a_0는 n_0일 때 최소
        // a1 > 0일 때, (c-a1) = 음수, n = 양수 -> n이 커짐에 따라, 무한한 음수
        // 그러므로, a1 > 0일 때는 a_0가 성립 불가함
        if (a_1 <= c) {
            if ((c-a_1)*n_0 >= a_0) ans = 1;
        }

        System.out.println(ans);
    }
}