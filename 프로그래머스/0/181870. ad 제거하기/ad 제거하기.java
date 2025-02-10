import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strArr));
        
        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i).contains("ad")){
                list.remove(i);
                i--;
            }
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}