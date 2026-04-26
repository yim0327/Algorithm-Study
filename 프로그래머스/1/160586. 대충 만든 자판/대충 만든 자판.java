class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) { // "ABCD"
            String s = targets[i];
            
            for (char c : s.toCharArray()) { // "A"
                int k = 100;
                
                for (String key : keymap) { // "ABACD"
                    // -1 or 인덱스
                    int idx = key.indexOf(String.valueOf(c));
                    
                    // "ABACD" 안에 "A"에 해당하는 값 = k
                    // key마다 찾아서(idx) 더 낮은 인덱스 반환
                    if (k != -1 && idx != -1) {
                        k = Math.min(idx, k);
                    }
                }
                
                // 모든 키를 찾았는데 없을 때 -> 바로 -1
                if (k == 100) {
                    answer[i] = -1;
                    break;
                }
                
                answer[i] += k+1;
            }
        }
        
        return answer;
    }
}