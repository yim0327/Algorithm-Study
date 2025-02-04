import java.util.Arrays;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        
        for(int i = 0; i < num_list.length; i+=n){
            answer[i/n] = Arrays.copyOfRange(num_list, i, i+n);
        }
        
        return answer;
    }
}