import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // sc 객체 생성
        int n = sc.nextInt();
        sc.nextLine();

        int result = 0;

        for(int i = 0; i < n; i++){ // n 만큼 반복
            String str = sc.nextLine();
            if(isGroupWord(str)){
                result++;
            }
        }
        System.out.println(result);
    }

    public static boolean isGroupWord(String str){
        boolean[] check = new boolean[26];
        char prev = ' ';

        for(int i = 0; i < str.length(); i++){ // 문자 수 만큼 반복
            char current = str.charAt(i);

            if(current != prev) { // 직전 문자와 다른 경우
                if(check[current - 'a']){ // 이전에 나왔던 경우
                    return false;
                }
                check[current - 'a'] = true; // 문자 등장 기록
            }
            prev = current;
        }

        return true;
    }
}
