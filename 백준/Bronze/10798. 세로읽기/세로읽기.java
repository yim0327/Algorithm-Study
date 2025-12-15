import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[5][];
        Scanner sc = new Scanner(System.in);
        
        int max_len = 0;
        for (int i = 0; i < 5; i++) {
            String s = sc.nextLine();
            arr[i] = s.split("");
            max_len = Math.max(max_len, s.length());
        }

        StringBuilder result = new StringBuilder();
        for(int j = 0; j < max_len; j++) {
            for (int i = 0; i < 5; i++) {
                if(j <= arr[i].length-1) {
                    result.append(arr[i][j]);
                }
            }
        }

        System.out.println(result);
    }
}
