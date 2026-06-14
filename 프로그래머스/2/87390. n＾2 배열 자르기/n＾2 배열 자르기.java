import java.util.Arrays;

class Solution {
    public int[] solution(int n, long left, long right) {
        int start_line = (int) (left / (long)n);
        int end_line = (int) (right / (long)n);
        
        int s_idx = (int) (left % (long)n);
        int e_idx = (int) (right % (long)n);
        
        int[] arr = new int[n * (end_line - start_line + 1)];
        
        int x = start_line + 1;
        int idx = 0;
        
        for (int i = 0; i < end_line - start_line + 1; i++) {
            int y = x+1;
            
            for (int j = 0; j < n; j++) {
                if (j < x) {
                    arr[idx] = x;
                }
                else {
                    arr[idx] = y;
                    y++;
                }
                idx++;
            }
            
            x++;
        }
        
        int a = (int)left - start_line * n;
        int b = (int)right - start_line * n + 1;
        
        int[] answer = Arrays.copyOfRange(arr, a, b);
        
        return answer;
    }
}