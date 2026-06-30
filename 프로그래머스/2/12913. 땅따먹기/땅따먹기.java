class Solution {
    private int calculrate(int[][] land, int row, int pass) {
        int max = 0;
        
        for (int i = 0; i < 4; i++) {
            if (i == pass) continue;
            max = Math.max(max, land[row-1][i]);
        }
        
        return max;
    }
    
    int solution(int[][] land) {
        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < 4; j++) {
                land[i][j] += calculrate(land, i, j);
            }
        }

        int len = land.length - 1;

        return Math.max(
            Math.max(land[len][0], land[len][1]),
            Math.max(land[len][2], land[len][3])
        );
    }
}