import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int idx = 0;
        Arrays.sort(array);
        
        if(array[0] > n){
            return array[0];
        }
        else if(array[array.length-1] < n){
            return array[array.length-1];
        }
        
        while(array[idx] < n){
            idx++;
        }
        
        return array[idx] - n >= n - array[idx-1] ? array[idx-1] : array[idx];
    }
}