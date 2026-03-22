import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 1; i < n; i++) {
            String st = String.valueOf(i);
            String[] arr = st.split("");

            ans += i; // 생성자

            for (String s : arr) { // 각 자릿수
                ans += Integer.parseInt(s);
            }

            if (ans == n) {
                ans = i;
                break;
            }
            else {
                ans = 0;
            }
        }

        System.out.println(ans);
    }
}