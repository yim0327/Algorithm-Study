import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String msg) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // 사전 초기화
        for (int i = 0; i < 26; i++) {
            char c = (char) ('A' + i);
            map.put(String.valueOf(c), i + 1);
        }

        int idx = 0;

        while (idx < msg.length()) {
            int end = idx + 1;

            // 사전에 존재하는 가장 긴 문자열 탐색
            while (end <= msg.length()
                    && map.containsKey(msg.substring(idx, end))) {
                end++;
            }

            // 마지막으로 사전에 존재했던 문자열
            String w = msg.substring(idx, end - 1);
            result.add(map.get(w));

            // 다음 글자까지 포함한 문자열을 사전에 추가
            if (end <= msg.length()) {
                String wc = msg.substring(idx, end);
                map.put(wc, map.size() + 1);
            }

            // 출력한 문자열 길이만큼 이동
            idx += w.length();
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}