import java.util.ArrayList;

class Solution {
    public String solution(int age) {
        String answer = "";
        ArrayList<Character> arr = new ArrayList<>();
        
        while(age > 0){
            arr.add((char)(age % 10 + 97));
            age /= 10;
        }
        
        for(int i = arr.size() -1; i >= 0; i--){
            answer += arr.get(i);
        }
     
        return answer;
    }
}