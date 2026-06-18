class Solution {
    static int result = 0;
    
    private void backtrack(int[][] dungeons, boolean[] visited, int k, int depth) {     
        if (depth == dungeons.length) {
            int tmp = 0;
            
            for (int i = 0; i < visited.length; i++) { 
                if (visited[i]) tmp++;
            }
            
            result = result < tmp ? tmp : result;
            return;
        }
        
        for (int i = 0; i < dungeons.length; i++) {
            int hp = k;
            
            if (!visited[i]) {
                if (k >= dungeons[i][0]) {
                    visited[i] = true;
                    hp -= dungeons[i][1];
                }
                
                backtrack(dungeons, visited, hp, depth+1);
                visited[i] = false;
            }
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        backtrack(dungeons, new boolean[dungeons.length], k, 0);
        return result;
    }
}