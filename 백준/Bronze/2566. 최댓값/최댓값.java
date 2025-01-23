import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        int max = 0;
        int low = 1;
        int column = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 9; i++){ // 9줄 읽기

            StringTokenizer s = new StringTokenizer(br.readLine());

            for(int j = 0; j < 9; j++){ // 9번 끊기
                
                int n = Integer.parseInt(s.nextToken());

                if(max < n){
                    max = n;
                    low = i+1;
                    column = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(low + " " + column);
    }
}