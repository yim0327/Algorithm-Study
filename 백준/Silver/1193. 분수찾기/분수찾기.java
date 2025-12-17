import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int cnt = 0, num = 0;
        int row, col;

        while (X > num) {
            cnt++;
            num += cnt;
        }

        if(cnt % 2 == 0) {
            row = X - num + cnt;
            col = num - X + 1;
        }
        else {
            row = num - X + 1;
            col = X - num + cnt;
        }

        System.out.print(row + "/" + col);
    }
}
