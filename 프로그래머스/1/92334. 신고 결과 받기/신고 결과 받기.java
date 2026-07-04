import java.util.HashMap;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int len = id_list.length;
        HashMap<String, Integer> idxMap = new HashMap<>(len);
        
        // 각 유저를 고정된 인덱스로 조회 가능 하도록
        for (int i = 0; i < len; i++) idxMap.put(id_list[i], i);
        
        int[] reported_cnt = new int[len]; // 유저별 신고 당한 횟수
        boolean[][] report_chk = new boolean[len][len]; // 신고-피신고 체크
        
        for (String r : report) {
            String[] user = r.split(" ");
            int a = idxMap.get(user[0]); // 신고자
            int b = idxMap.get(user[1]); // 피신고자
            
            if (report_chk[a][b]) continue; // 중복 방지
            
            reported_cnt[b]++;
            report_chk[a][b] = true;
        }
        
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            if (reported_cnt[i] >= k) { // 피신고 횟수가 k 이상일 때
                for (int j = 0; j < len; j++) {
                    answer[j] += report_chk[j][i] ? 1 : 0;
                }
            }
        }
        
        return answer;
    }
}