import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int[][] exchange = new int[friends.length][friends.length];
        int[][] gFigure = new int[friends.length][2];
        
        HashMap<String, Integer> indexMap = new HashMap<>();
        
        for (int i = 0; i < friends.length; i++) {
            indexMap.put(friends[i], i);
        }
        
        // 이번달 선물 기록
        for (String g : gifts) {
            String[] f = g.split(" ");
            
            int gvIdx = indexMap.get(f[0]);
            int rvIdx = indexMap.get(f[1]);
            
            exchange[gvIdx][rvIdx]++;
            
            // 선물 지수 기록
            gFigure[gvIdx][0]++;
            gFigure[rvIdx][1]++;
        }
        
        int[] giftCnt = new int[friends.length];
        
        // 다음달 선물 계산
        for (int x = 0; x < friends.length; x++) {
            for (int y = x+1; y < friends.length; y++) {
                // 주고받은 기록이 없거나, 같다면
                if ((exchange[x][y] == 0 && exchange[y][x] == 0)
                   || exchange[x][y] == exchange[y][x]) {
                    if (gFigure[x][0]-gFigure[x][1] > gFigure[y][0]-gFigure[y][1]) {
                        giftCnt[x]++;
                    }
                    else if (gFigure[x][0]-gFigure[x][1] < gFigure[y][0]-gFigure[y][1]) {
                        giftCnt[y]++;
                    }
                }
                
                // 주고받은 기록이 있다면
                else {
                    if (exchange[x][y] > exchange[y][x]) {
                        giftCnt[x]++;
                    }
                    else {
                        giftCnt[y]++;
                    }
                }
                
            }
        }
        
        int answer = 0;
        
        for (int j = 0; j < giftCnt.length; j++) {
            answer = Math.max(answer, giftCnt[j]);
        }
        
        return answer;
    }
}