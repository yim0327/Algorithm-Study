import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(s.nextToken());
        int b = Integer.parseInt(s.nextToken());
        int c = Integer.parseInt(s.nextToken());

        int[] arr = new int[3];

        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        Arrays.sort(arr);

        if (arr[2] >= arr[0] + arr[1]) System.out.println(2 * (arr[0] + arr[1]) - 1);
        else System.out.println(a + b + c);
    }
}