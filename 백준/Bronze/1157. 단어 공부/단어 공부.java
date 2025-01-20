import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // 문자열 받기

        int len = str.length(); // 문자열 길이

        char[] arr = {'A', 'B', 'C', 'D', 'E', 
                    'F', 'G', 'H', 'I', 'J', 
                    'K', 'L', 'M', 'N', 'O', 
                    'P', 'Q', 'R', 'S', 'T', 
                    'U', 'V', 'W', 'X', 'Y', 'Z'};

        int[] num = new int[26];

        for(int i = 0; i<len; i++){ // 각 문자를 대문자로 바꾼 후 카운트
            char c = str.charAt(i);
            int x = (int)c;
            
            if(x >= 97 && x <= 122){ // 소문자일 때 대문자 바꾸기
                x -= 32;
            }

            num[x - 65] += 1;
        }

        int max = 0;
        int tmp = 0;
        int cnt = 0;

        for(int j = 0; j < 26; j++){ // 가장 많이 쓰인 알파벳 구하기
            if(max < num[j]){
                max = num[j];
                tmp = j + 65;
            }
        }
        for(int k = 0; k < 26; k++){ // 여러 개일 때 "?" 출력
            if(max == num[k]){
                cnt += 1;
            }
        }
        
        char h = (char)tmp;

        if(cnt >= 2){
            System.out.println("?");
        }
        else{
            System.out.println(h);
        }
    }
}

// a = 97
// A = 65 (+32)