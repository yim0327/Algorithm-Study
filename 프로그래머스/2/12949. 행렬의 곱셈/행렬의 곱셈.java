class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        int r = 0;
        int c = 0;
        
        while (r < arr1.length) {
            while (c < arr2[0].length) {
                for (int i = 0; i < arr1[0].length; i++) {
                    answer[r][c] += arr1[r][i] * arr2[i][c];
                }
                c++;
            }
            c = 0;
            r++;
        }
        
        return answer;
    }
}