import java.util.ArrayList;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            String tmp = my_string.charAt(i)+"";
            if(!tmp.equals("0")){
                arr.add(tmp);
                my_string = my_string.replace(tmp, "0");
            }
        }
        
        for(int j = 0; j < arr.size(); j++){
            answer += arr.get(j);
        }
        
        return answer;
    }
}