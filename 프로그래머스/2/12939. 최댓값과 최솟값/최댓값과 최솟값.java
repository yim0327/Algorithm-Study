import java.util.Arrays;

class Solution {
    public String solution(String s) {        
        String[] arr = s.split(" ");
        
        int[] arr2 = Arrays.stream(arr)
                        .mapToInt(Integer::parseInt)
                        .toArray();
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr2.length; i++){
            max = Math.max(max, arr2[i]);
            min = Math.min(min, arr2[i]);
        }
        
        return min + " " + max;
    }
}