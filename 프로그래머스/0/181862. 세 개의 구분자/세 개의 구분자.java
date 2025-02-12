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
        
        return list.isEmpty() ? new String[] { "EMPTY" } : list.toArray(new String[list.size()]);
    }
}