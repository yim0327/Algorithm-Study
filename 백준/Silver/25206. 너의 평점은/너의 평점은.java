import java.util.*;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // sc 객체 생성
        
        double result = 0;
        double sum = 0;

        for(int i = 0; i < 20; i++){
            String str = sc.nextLine();
            String[] arr = str.split(" "); // (0)과목명 / (1)학점 / (2)등급

            double score = Double.parseDouble(arr[1]); // 학점

            if(arr[2].equals("A+")){
                result += score * 4.5;
                sum += score;
            }
            else if(arr[2].equals("A0")) {
                result += score * 4.0;
                sum += score;
            }
            else if(arr[2].equals("B+")) {
                result += score * 3.5;
                sum += score;
            }
            else if(arr[2].equals("B0")) {
                result += score * 3.0;
                sum += score;
            }
            else if(arr[2].equals("C+")) {
                result += score * 2.5;
                sum += score;
            }
            else if(arr[2].equals("C0")) {
                result += score * 2.0;
                sum += score;
            }
            else if(arr[2].equals("D+")) {
                result += score * 1.5;
                sum += score;
            }
            else if(arr[2].equals("D0")) {
                result += score * 1.0;
                sum += score;
            }
            else if(arr[2].equals("F")) {
                result += 0;
                sum += score;
            }
            else{ // "P"
                result += 0;
            }
        }
        System.out.println(result/sum);
    }
}