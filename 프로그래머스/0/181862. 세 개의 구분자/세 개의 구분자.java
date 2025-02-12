import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.split("[abc]");
        ArrayList<String> list = new ArrayList<>();
        
        for(String s : arr){
            if(!s.equals("")){
                list.add(s);
            }
        }
        
        if(list.isEmpty()){
            list.add("EMPTY");
        }
        
        return list.toArray(new String[list.size()]);
    }
}