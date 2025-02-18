import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] array, int height) {
        int n = 0;
        
        Integer[] arr = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        array = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
        
        if(array[0] < height){
            return 0;
        }
        if(array[array.length-1] > height){
            return array.length;
        }
        
        for(int i = 0; i < array.length; i++){            
            if(height >= array[i]){
                n = i;
                break;
            }
        }
                
        return n;
    }
}