import java.util.Arrays;

class Solution {    
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length-1;
        
        if(board.length == 1){ // 1x1 배열
            if(board[0][0] == 1){
                return 0;
            }
            else{
                return 1;
            }
        }
        
        for(int i = 0; i < board.length; i++){ // row
            for(int j = 0; j < board.length; j++){ // column
                if(board[i][j] == 1){
                    if(i == 0 && j == 0){ // 좌상단
                        board[0][1] = (board[0][1] == 1) ? 1 : 2;
                        board[1][0] = (board[1][0] == 1) ? 1 : 2;
                        board[1][1] = (board[1][1] == 1) ? 1 : 2;
                    }
                    else if(i == 0 && j == n){ // 우상단
                        board[0][n-1] = (board[0][n-1] == 1) ? 1 : 2;
                        board[1][n] = (board[1][n] == 1) ? 1 : 2;
                        board[1][n-1] = (board[1][n-1] == 1) ? 1 : 2;
                    }
                    else if(i == n && j == 0){ // 좌하단
                        board[n][1] = (board[n][1] == 1) ? 1 : 2;
                        board[n-1][0] = (board[n-1][0] == 1) ? 1 : 2;
                        board[n-1][1] = (board[n-1][1] == 1) ? 1 : 2;
                    }
                    else if(i == n && j == n){ // 우하단
                        board[n][n-1] = (board[n][n-1] == 1) ? 1 : 2;
                        board[n-1][n-1] = (board[n-1][n-1] == 1) ? 1 : 2;
                        board[n-1][n] = (board[n-1][n] == 1) ? 1 : 2;
                    }
                    else{ // 꼭짓점이 아닐 때, 모서리 캐치
                        if(i == 0){ // 상단
                            board[0][j-1] = (board[0][j-1] == 1) ? 1 : 2;
                            board[0][j+1] = (board[0][j+1] == 1) ? 1 : 2;
                            board[1][j-1] = (board[1][j-1] == 1) ? 1 : 2;
                            board[1][j] = (board[1][j] == 1) ? 1 : 2;
                            board[1][j+1] = (board[1][j+1] == 1) ? 1 : 2;
                        }

                        else if(i == n){ // 하단
                            board[n][j-1] = (board[n][j-1] == 1) ? 1 : 2;
                            board[n][j+1] = (board[n][j+1] == 1) ? 1 : 2;
                            board[n-1][j-1] = (board[n-1][j-1] == 1) ? 1 : 2;
                            board[n-1][j] = (board[n-1][j] == 1) ? 1 : 2;
                            board[n-1][j+1] = (board[n-1][j+1] == 1) ? 1 : 2;
                        }
                        else if(j == 0){ // 왼쪽
                            board[i-1][0] = (board[i-1][0] == 1) ? 1 : 2;
                            board[i+1][0] = (board[i+1][0] == 1) ? 1 : 2;;
                            board[i-1][1] = (board[i-1][1] == 1) ? 1 : 2;
                            board[i][1] = (board[i][1] == 1) ? 1 : 2;
                            board[i+1][1] = (board[i+1][1] == 1) ? 1 : 2;
                        }
                        else if(j == n){ // 오른쪽
                            board[i-1][n] = (board[i-1][n] == 1) ? 1 : 2;
                            board[i+1][n] = (board[i+1][n] == 1) ? 1 : 2;
                            board[i-1][n-1] = (board[i-1][n-1] == 1) ? 1 : 2;
                            board[i][n-1] = (board[i][n-1] == 1) ? 1 : 2;
                            board[i+1][n-1] = (board[i+1][n-1] == 1) ? 1 : 2;
                        }
                        else{ // 그 외 모든 내부칸
                            board[i-1][j-1] = (board[i-1][j-1] == 1) ? 1 : 2;
                            board[i-1][j] = (board[i-1][j] == 1) ? 1 : 2;
                            board[i-1][j+1] = (board[i+1][j+1] == 1) ? 1 : 2;
                            board[i][j-1] = (board[i][j-1] == 1) ? 1 : 2;
                            board[i][j+1] = (board[i][j+1] == 1) ? 1 : 2;;
                            board[i+1][j-1] = (board[i+1][j-1] == 1) ? 1 : 2;
                            board[i+1][j] = (board[i+1][j] == 1) ? 1 : 2;
                            board[i+1][j+1] = (board[i+1][j+1] == 1) ? 1 : 2;
                        }
                    }    
                }
            }
        }
        
        for(int x = 0; x < board.length; x++){
            System.out.print(Arrays.toString(board[x]));
            for(int y = 0; y < board.length; y++){
                if(board[x][y] == 0){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
