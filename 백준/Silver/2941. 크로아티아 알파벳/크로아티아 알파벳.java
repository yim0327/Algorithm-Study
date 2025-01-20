import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int cnt = 0;
        int len = str.length();

        for(int i = 2; i < len + 2; i++){
            char tmp = ' ';
            char ntmp = ' ';
            char nntmp = ' ';
            
            if(i < len){
                tmp = str.charAt(i);
            }
            if(i-1 < len){
                ntmp = str.charAt(i-1);
            }
            if(i-2 < len){
                nntmp = str.charAt(i-2);
            }

            if(nntmp == 'c' && (ntmp == '-' || ntmp == '=')){ // 1, 2
                i += 1;
                cnt += 1;
            }
            else if(nntmp == 'd' && ntmp == 'z' && tmp == '='){ // 3
                i += 2;
                cnt += 1;
            }
            else if(nntmp == 'd' && ntmp == '-'){ // 4
                i += 1;
                cnt += 1;
            }
            else if(nntmp == 'l' && ntmp == 'j'){ // 5
                i += 1;
                cnt += 1;
            }
            else if(nntmp == 'n' && ntmp == 'j'){ // 6
                i += 1;
                cnt += 1;
            }
            else if(nntmp == 's' && ntmp == '='){ // 7
                i += 1;
                cnt += 1;
            }
            else if(nntmp == 'z' && ntmp == '='){ // 8
                i += 1;
                cnt += 1;
            }
            else{
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
