import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> del_list = Arrays.stream(delete_list)
                                    .boxed()
                                    .collect(Collectors.toList());
        
        for(int i = 0; i < arr.length; i++){
            if(!del_list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        
        return list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}