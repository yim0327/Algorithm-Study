class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        for (int l : lottos) {
            for (int w : win_nums) {
                if (w == l) {
                    answer[0]++;
                    answer[1]++;
                }
            }
            
            if (l == 0) answer[0]++;
        }
        
        for (int i = 0; i < 2; i++) {
            switch (answer[i]) {
                case 6 :
                    answer[i] = 1;
                    break;
                case 5 :
                    answer[i] = 2;
                    break;
                case 4 :
                    answer[i] = 3;
                    break;
                case 3 :
                    answer[i] = 4;
                    break;
                case 2 :
                    answer[i] = 5;
                    break;
                default :
                    answer[i] = 6;
            }
        }
                
        return answer;
    }
}