class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        if ( !(h-1 < 0) 
            && board[h][w].equals(board[h-1][w])) { // 상
            answer++;
        }
        if ( !(h+1 > board.length-1) 
            && board[h][w].equals(board[h+1][w])) { // 하
            answer++;
        }
        
        if (!(w-1 < 0) 
        && board[h][w].equals(board[h][w-1])) { // 좌
            answer++;
        }
        if (!(w+1 > board[0].length-1) 
        && board[h][w].equals(board[h][w+1])) { // 우
            answer++;
        }
        
        return answer;
    }
}