import java.util.Arrays;

class Solution {
    public int[] parseStringToIntArr(String s) {
        return Arrays.stream(s.split(":"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
    }
    
    public void skipOpening(int[] time, int[] os, int[] oe) {
        if (time[0] >= os[0] && time[0] <= oe[0]) {
            if (!(time[0] == os[0] && time[1] < os[1])
               && !(time[0] == oe[0] && time[1] > oe[1])) {
                time[1] = oe[1];
                time[0] = oe[0];
            }
        }
    }
    
    public String solution(String video_len, String pos, 
                           String op_start, String op_end, String[] commands) {
        int[] time = parseStringToIntArr(pos);
        int[] os = parseStringToIntArr(op_start);
        int[] oe = parseStringToIntArr(op_end);
        int[] len = parseStringToIntArr(video_len);
        int[] cut = Arrays.copyOf(len, len.length);
        
        // 남은 시간 10초 미만 기준 설정
        if (len[1] < 10) {
            if (len[0] == 0) {
                cut[0] = 0;
                cut[1] = 0;
            }
            else {
                cut[0] -= 1;
                cut[1] += 50;
            }
        }
        else {
            cut[1] -= 10;
        }
                
        skipOpening(time, os, oe); // 오프닝 건너뛰기
                
        /** 동영상 시간 조정 **/
        for (String cmd : commands) {
            if (cmd.equals("next")) { // 10초 후로 이동
                // 남은 시간 10초 미만 시
                if ((time[0] == cut[0] && time[1] > cut[1])
                   || (time[0] == cut[0] - 1 && time[1] - 50 > cut[1])) {
                    time[1] = len[1];
                    time[0] = len[0];
                }
                else time[1] += 10;
                
                if (time[1] >= 60) {
                    time[1] -= 60;
                    time[0] += 1;
                }
            }
            
            if (cmd.equals("prev")) { // 10초 전으로 이동
                // 현재 위치 10초 미만 시
                if (time[0] == 0 && time[1] < 10) time[1] = 0;
                else time[1] -= 10;
                
                if (time[0] != 0 && time[1] < 0) {
                    time[0] -= 1;
                    time[1] += 60;
                }
            }
            
            skipOpening(time, os, oe); // 오프닝 건너뛰기
        }
                
        StringBuilder sb = new StringBuilder(5);
        
        if (String.valueOf(time[0]).length() == 1) sb.append("0");
        sb.append(time[0] + ":");
        if (String.valueOf(time[1]).length() == 1) sb.append("0");
        sb.append(time[1]);
        
        return sb.toString();
    }
}