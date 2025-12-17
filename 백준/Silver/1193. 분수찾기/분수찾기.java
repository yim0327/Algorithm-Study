import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        if(num == 1){
            System.out.println("1/1");
        }
        else {
            int row=1, col=1;
            int cnt=1, cnt2=1;

            while(true) {
                if(cnt == 1) {
                    row++;
                    col += 2;
                }
                else if(cnt % 2 != 0) {
                    row++;
                    col += cnt*2;
                }
                else {
                    row += cnt*2;
                    col++;
                }

                cnt++;

                if(row >= num || col >= num) {
                    break;
                }
            }

            if(row > col) {
                while(row != num && col != num) {
                    row--;
                    col++;

                    cnt2++;
                }
            }
            else {
                while(col != num && row != num) {
                    row++;
                    col--;

                    cnt2++;
                }
            }

            if(num == row) {
                System.out.println(cnt2+"/"+(cnt - cnt2 + 1));
            }
            else {
                System.out.println((cnt - cnt2 + 1)+"/"+cnt2);
            }
        }
    } // main
}
