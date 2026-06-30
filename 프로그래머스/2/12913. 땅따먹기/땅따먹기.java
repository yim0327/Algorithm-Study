class Solution {
    int solution(int[][] land) {
        int len = land.length-1;

        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < 4; j++) {
                int max = 0;
                
                for (int k = 0; k < 4; k++) {
                    if (j == k) continue;
                    max = max < land[i-1][k] ? land[i-1][k] : max;
                }
                
                land[i][j] += max;
            }
        }
        
        return Math.max(
                    Math.max(
                        Math.max(land[len][0], land[len][1]),
                        land[len][2]
                    ),
                    land[len][3]
                );
    }
}