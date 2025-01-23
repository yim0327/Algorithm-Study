import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken());
        int m = Integer.parseInt(s.nextToken());

        // N * M 행렬
        int[][] arr = new int[n][m];

        // 열 채우기
        for(int i = 0; i < 2 * n; i++){ // 0 1 2 / 3 4 5

            s = new StringTokenizer(br.readLine());

            // 행 채우기
            for(int j = 0; j < m; j++){ // 0 1 2 3
                int value = Integer.parseInt(s.nextToken());

                if(i < n) { // 첫 번째 행렬
                    arr[i][j] = value;
                }
                else{ // 두 번째 행렬 (바로 더하기)
                    arr[i-n][j] += value;
                }
            }
        }
        
        for(int x = 0; x < n; x++){
            for(int y = 0; y < m; y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }
    }
}