class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health; // 현재 체력 (변화량)
        int cnt = 0;         // 연속 성공
        int idx = 0;         // 공격 턴
        
        for (int t = 1; t <= attacks[attacks.length-1][0]; t++) {
            // [공격 턴]
            if (t == attacks[idx][0]) {
                answer -= attacks[idx][1];
                
                // 체력 0 이하 시 사망
                if (answer <= 0) return -1;
                
                cnt = 0;
                idx++;
            }
            // [회복 턴]
            else {
                answer += bandage[1];
                cnt++;
                
                // 연속 성공 시 추가 회복
                if (cnt == bandage[0]) {
                    answer += bandage[2];
                    cnt = 0;
                }
                
                if (answer > health) answer = health;
            }
        }
        
        return answer;
    }
}