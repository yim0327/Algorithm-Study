import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.lang.Math;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr)
                                        .boxed()
                                        .collect(Collectors.toList());
        int len = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr.length < Math.pow(2, i+1) && arr.length > Math.pow(2, i)){
                len = (int)Math.pow(2, i+1);
            }
            else if(arr.length == Math.pow(2, i)){
                return arr;
            }
        }
        
        for(int j = 0; j < len-arr.length; j++){
            list.add(0);
        }
        
        return list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}