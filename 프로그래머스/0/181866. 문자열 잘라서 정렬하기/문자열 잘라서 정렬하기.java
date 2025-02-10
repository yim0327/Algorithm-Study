import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] tmp = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        
        Arrays.sort(tmp);
        
        for(int i = 0; i < tmp.length; i++){
            if(!tmp[i].equals("")){
                list.add(tmp[i]);
            }
        }
        
        return list.toArray(new String[list.size()]);
    }
}