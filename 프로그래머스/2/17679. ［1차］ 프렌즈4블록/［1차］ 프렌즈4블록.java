class Solution {
    static int r, c;
    static boolean flag = true;
    static String[][] rc_board;
    
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        r = m;
        c = n;
        rc_board = new String[r][c];
        
        for (int i = 0; i < r; i++) rc_board[i] = board[i].split("");        
        
        while (flag) answer += playStage();
        
        return answer;
    }
    
    private int playStage() {
        boolean[][] check = new boolean[r][c];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (rc_board[i][j] == null 
                    || rc_board[i][j].equals("X")) continue;
                if (i+1 < r && rc_board[i][j].equals(rc_board[i+1][j]) 
                    && j+1 < c && rc_board[i][j].equals(rc_board[i][j+1]) 
                    && rc_board[i][j].equals(rc_board[i+1][j+1])) {
                    check[i][j] = true;
                    check[i+1][j] = true;
                    check[i][j+1] = true;
                    check[i+1][j+1] = true;
                }
            }
        }
        
        return checkHit(check);
    }
    
    private int checkHit(boolean[][] check) {
        int count = 0;
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (check[i][j] == true) {
                    count++;
                    rc_board[i][j] = "X";
                }
            }
        }
        
        if (count <= 0) {
            flag = false;
            return 0;
        }
        
        updateBoard();
        
        return count;
    }
    
    private void updateBoard() {
        String[][] new_board = new String[r][c];
        
        for (int j = 0; j < c; j++) {
            int n_r = r-1;
            
            for (int i = r-1; i >= 0; i--) {
                if (rc_board[i][j] != null && !rc_board[i][j].equals("X")) {
                    new_board[n_r][j] = rc_board[i][j];
                    n_r--;
                }
            }
        }
        
        rc_board = new_board;
    }
}