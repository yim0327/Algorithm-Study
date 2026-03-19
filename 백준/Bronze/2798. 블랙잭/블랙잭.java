import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken()); // 펼쳐진 카드 개수
        int m = Integer.parseInt(s.nextToken()); // 기준 넘버

        s = new StringTokenizer(br.readLine());
        int[] cards = new int[n];

        for (int i = 0 ; i < n; i++) {
            cards[i] = Integer.parseInt(s.nextToken());
        }

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    int tmp = cards[i] + cards[j] + cards[k];

                    if (tmp <= m && tmp > ans) ans = tmp;
                }
            }
        }

        System.out.println(ans);
    }
}