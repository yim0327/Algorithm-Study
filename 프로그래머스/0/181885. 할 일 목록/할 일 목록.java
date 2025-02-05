import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i = 0; i < todo_list.length; i++){
            if(finished[i] == false){
                arr.add(todo_list[i]);
            }
        }
        
        return arr.toArray(new String[arr.size()]);
    }
}