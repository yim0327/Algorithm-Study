class Solution {
    public int solution(int[][] dots) {     
        // 1-2 3-4 기울기 비교
        if((double)(dots[0][1] - dots[1][1])/(dots[0][0] - dots[1][0]) 
                == (double)(dots[2][1] - dots[3][1])/(dots[2][0] - dots[3][0])) {
            return 1;
        }
        
        // 1-3 2-4 기울기 비교
        if((double)(dots[0][1] - dots[2][1])/(dots[0][0] - dots[2][0]) 
                == (double)(dots[1][1] - dots[3][1])/(dots[1][0] - dots[3][0])) {
            return 1;
        }
        
        // 1-4 2-3 기울기 비교
        if((double)(dots[0][1] - dots[3][1])/(dots[0][0] - dots[3][0]) 
                == (double)(dots[1][1] - dots[2][1])/(dots[1][0] - dots[2][0])) {
            return 1;
        }
        
        return 0;
    }
}