import java.util.HashSet;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        String[] words = message.split(" ");
        
        HashSet<String> notSpo = new HashSet<>();
        HashSet<String> spo = new HashSet<>();

        int idx = 0;
        
        for (int i = 0; i < words.length; i++) {
            int s = idx;                         // 단어 시작 인덱스
            int e = idx + words[i].length() - 1; // 단어 끝 인덱스

            boolean isSpo = false;

            for (int j = 0; j < spoiler_ranges.length; j++) {
                int s_spo = spoiler_ranges[j][0];
                int e_spo = spoiler_ranges[j][1];

                // 단어 구간과 스포 구간이 겹치는지
                if (s <= e_spo && s_spo <= e) {
                    isSpo = true;
                    break;
                }
            }

            if (isSpo) {
                spo.add(words[i]);
            } else {
                notSpo.add(words[i]);
            }
            
            idx += words[i].length() + 1;
        }
                
        int answer = 0;
        
        // 일반 단어와 중복 X 
        for (String s : spo) {
            if (!notSpo.contains(s)) answer++;
        }
                
        return answer;
    }
}