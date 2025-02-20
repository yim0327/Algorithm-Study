class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for(String move : keyinput){
            
            answer[0] = (answer[0]>board[0]/2) ? board[0]/2 : (answer[0] < -board[0]/2) ? -board[0]/2 : answer[0];
        
            answer[1] = (answer[1]>board[1]/2) ? board[1]/2 : (answer[1] < -board[1]/2) ? -board[1]/2 : answer[1];
            
            if(move.equals("left") || move.equals("right")){
                answer[0] += move.equals("left") ? -1 : 1;
            }
            else{
                answer[1] += move.equals("down") ? -1 : 1;
            }
        }
        
        answer[0] = (answer[0]>board[0]/2) ? board[0]/2 : (answer[0] < -board[0]/2) ? -board[0]/2 : answer[0];
        
        answer[1] = (answer[1]>board[1]/2) ? board[1]/2 : (answer[1] < -board[1]/2) ? -board[1]/2 : answer[1];
            
        return answer;
    }
}