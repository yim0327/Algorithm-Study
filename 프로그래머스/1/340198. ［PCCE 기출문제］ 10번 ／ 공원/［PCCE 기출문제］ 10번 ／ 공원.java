import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;

        Arrays.sort(mats);
 
        for (int k = mats.length-1; k >= 0; k--) {
            int m = mats[k];
            
            for (int r = 0; r + m <= park.length; r++) { // 행
                for (int c = 0; c + m <= park[0].length; c++) { // 열
                    boolean flag = true;

                    // 공원 내 m x m 정사각형 공간 확인
                    for (int i = r; i < r + m; i++) {
                        for (int j = c; j < c + m; j++) {
                            if (!park[i][j].equals("-1")) {
                                flag = false;
                                break;
                            }
                        }
                        if (!flag) break;
                    }

                    if (flag) return m;
                }
            }
        }
        
        return -1;
    }
}