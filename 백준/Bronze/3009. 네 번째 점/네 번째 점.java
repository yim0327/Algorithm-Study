import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> x = new ArrayDeque<>();
        Deque<Integer> y = new ArrayDeque<>();

        StringTokenizer s = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(s.nextToken());
        int b = Integer.parseInt(s.nextToken());

        x.add(a);
        y.add(b);

        for (int i = 0; i < 2; i++) {
            s = new StringTokenizer(br.readLine());
            a = Integer.parseInt(s.nextToken());
            b = Integer.parseInt(s.nextToken());

            if (x.isEmpty()) {
                x.addFirst(a);
            } else {
                if (x.getFirst() == a) {
                    x.pollFirst();
                } else if (x.getLast() == a) {
                    x.pollLast();
                } else {
                    x.addFirst(a);
                }
            }

            if (y.isEmpty()) {
                y.addFirst(b);
            } else {
                if (y.getFirst() == b) {
                    y.pollFirst();
                } else if (y.getLast() == b) {
                    y.pollLast();
                } else {
                    y.addFirst(b);
                }
            }
        }

        int ans_x = x.remove();
        int ans_y = y.remove();

        System.out.println(ans_x + " " + ans_y);
    }
}