import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String tmp = "";
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            if(!String.valueOf(my_string.charAt(i)).equals(" ")){
                tmp += String.valueOf(my_string.charAt(i));
            }
            else{
                if(!tmp.equals("")){
                    list.add(tmp);
                }
                tmp = "";
            }
        }
        
        if(!tmp.equals("")){
            list.add(tmp);
        }
        
        return list.toArray(new String[list.size()]);
    }
}