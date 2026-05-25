import java.util.HashMap;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Integer> map = new HashMap<>(id_list.length);
        
        // 유저 ID를 인덱스로 조회 가능 하도록
        for (int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], i);
        }
        
        int[] cnt = new int[id_list.length];
        int[][] check = new int[id_list.length][id_list.length];
        
        for (String r : report) {
            String[] users = r.split(" ");
            int x_idx = map.get(users[0]); // 신고자
            int y_idx = map.get(users[1]); // 피신고자
            
            // 동일인 중복 신고 체크
            if (check[x_idx][y_idx] == 0) {
                check[x_idx][y_idx] = 1;
                cnt[y_idx]++;
            }
        }
        
        int[] answer = new int[id_list.length];
        
        for (int i = 0; i < cnt.length; i++) {
            // i번 째 유저가 k번 이상 신고 당했을 시
            if (cnt[i] >= k) {
                for (int j = 0; j < id_list.length; j++) {
                    // i를 신고한 모든 유저(j)들에게 메일 전송
                    if (check[j][i] == 1) answer[j]++;
                }
            }
            
        }
        
        return answer;
    }
}