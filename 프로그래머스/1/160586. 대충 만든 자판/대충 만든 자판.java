class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            
            for (int j = 0; j < targets[i].length(); j++) {
                int tmp = Integer.MAX_VALUE;
                String t = String.valueOf(targets[i].charAt(j));
                
                for (int k = 0; k < keymap.length; k++) {
                    int idx = keymap[k].indexOf(t);
                    
                    if (idx == -1) continue;
                    else tmp = idx < tmp ? idx : tmp;
                }
                
                if (tmp == Integer.MAX_VALUE) {
                    count = -1;
                    break;
                }
                else count += tmp+1;
            }
            
            answer[i] = count;
        }
        
        return answer;
    }
}