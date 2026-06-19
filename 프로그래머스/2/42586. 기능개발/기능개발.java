import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arr = new ArrayList<>();
        int day = 0;
        int done = 0;
        
        for (int i = 0; i < progresses.length; i++) {
            // 선행 작업 완료시키기
            if (done == 0) {
                day += (int) Math.ceil((float) (100-progresses[i]) / speeds[i]);
                done++;
            }
            // 후행 작업도 끝났는지 확인
            else {
                if (progresses[i] + day * speeds[i] >= 100) {
                    done++;
                }
                else {
                    // 이전까지의 작업 배포
                    progresses[i] = progresses[i] + day * speeds[i];
                    arr.add(done);
                    done = 0;
                    
                    i--; // 이번 작업을 선행 작업으로
                }
            }
        }
        
        // 마지막 작업 확인
        if (done == 0) arr.add(1);
        else arr.add(done);
        
        return arr.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}