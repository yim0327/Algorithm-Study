import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        String[] arr = Arrays.stream(rank)
                            .mapToObj(String::valueOf)
                            .toArray(String[]::new);
        
        for(int i = 1; i <= rank.length; i++){
            int idx = Arrays.asList(arr).indexOf(String.valueOf(i));
            
            if(attendance[idx] == true){
                list.add(idx);
            }
            
            if(list.size() == 3){
                break;
            }
        }
        
        return list.get(0) * 10000
                + list.get(1) * 100
                + list.get(2);
    }
}