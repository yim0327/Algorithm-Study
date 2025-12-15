import java.util.Scanner;

public class Main {
    // 넓이 칠하기
    public static int[][] fill_arr(int[][] arr, int row, int col) {
        for (int i = row; i < row+10; i++) {
            for (int j = col; j < col+10; j++) {
                arr[i][j] = 1;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        int result = 0;

        // 정사각형 배열 생성
        String[][] sq = new String[cnt][2];
        for (int i = 0; i < cnt; i++) {
            sq[i] = sc.nextLine().split(" ");
        }

        int x_max = 0;
        int y_max = 0;
        for (int i = 0; i < cnt; i++) {
            x_max = Math.max(x_max, Integer.parseInt(sq[i][0]));
            y_max = Math.max(y_max, Integer.parseInt(sq[i][1]));
        }

        // 색칠된 넓이 계산
        int[][] arr = new int[x_max+10][y_max+10];

        for (int i = 0; i < cnt; i++) {
            int x = Integer.parseInt(sq[i][0]);
            int y = Integer.parseInt(sq[i][1]);
            fill_arr(arr, x, y);
        }

        // 결과 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
