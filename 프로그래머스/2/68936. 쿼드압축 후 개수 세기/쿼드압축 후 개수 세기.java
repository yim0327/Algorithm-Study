class Solution {
    static int[] answer = new int[] {0, 0}; // 0 개수, 1 개수
    
    public int[] solution(int[][] arr) {        
        check_press(arr, new int[] {0, 0}, arr.length);
        return answer;
    }
    
    private void check_press(int[][] arr, int[] start, int len) {
        int check_num = arr[start[0]][start[1]];
        
        if (len == 1) {
            if (check_num == 0) answer[0] += 1;
            else answer[1] += 1;
            return;
        }
                
        // check
        boolean pass = true;
        
        for (int r = start[0]; r < start[0]+len; r++) {
            for (int c = start[1]; c < start[1]+len; c++) {
                if (check_num != arr[r][c]) {
                    pass = false;
                    break;
                }
            }
            if (!pass) break;
        }
        
        // press
        if (pass) {
            if (check_num == 0) answer[0] += 1;
            else answer[1] += 1;
        }
        else {
            check_press(arr, new int[] {start[0], start[1]}, len/2); // 좌상
            check_press(arr, new int[] {start[0]+len/2, start[1]}, len/2); // 좌하
            check_press(arr, new int[] {start[0], start[1]+len/2}, len/2); // 우상
            check_press(arr, new int[] {start[0]+len/2, start[1]+len/2}, len/2); // 우하
        }
        
    }
}