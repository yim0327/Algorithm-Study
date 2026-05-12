class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        answer[1] = -1;
        
        for (int x = 0; x < wallpaper.length; x++) {
            String[] row = wallpaper[x].split("");
            
            for (int y = 0; y < row.length; y++) {
                if (row[y].equals("#")) {
                    if (answer[2] == 0) answer[0] = x;
                    answer[2] = x+1;
                    
                    if (answer[1] == -1) answer[1] = y;
                    answer[1] = Math.min(answer[1], y);
                    answer[3] = Math.max(answer[3], y+1);
                }
            }
        }
        
        return answer;
    }
}