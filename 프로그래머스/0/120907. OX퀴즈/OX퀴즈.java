class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++){
            String[] tmp = quiz[i].split(" ");
            
            int X = Integer.parseInt(tmp[0]);
            int Y = Integer.parseInt(tmp[2]);
            int Z = Integer.parseInt(tmp[4]);
            
            if(tmp[1].equals("-")){
                if(X - Y == Z){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
            else{
                if(X + Y == Z){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}