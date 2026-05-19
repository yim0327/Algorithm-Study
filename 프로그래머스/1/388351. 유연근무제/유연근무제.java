class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i = 0; i < schedules.length; i++) {
            boolean flag = true;
            int set = startday;
            
            for (int j = 0; j < timelogs[0].length; j++) {
                
                if (set != 6 && set != 7) {
                    int tmp = schedules[i] + 10;
                    if (tmp % 100 >= 60) tmp += 40;
                    
                    if (tmp < timelogs[i][j]) {
                        flag = false;
                        break;
                    }
                }
                
                set = ++set > 7 ? set%7 : set;
            }
            
            if (flag) answer++;
        }
        
        return answer;
    }
}