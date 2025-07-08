class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        int n = Math.max(row, column);
        
        int[][] answer = new int[n][n];
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}