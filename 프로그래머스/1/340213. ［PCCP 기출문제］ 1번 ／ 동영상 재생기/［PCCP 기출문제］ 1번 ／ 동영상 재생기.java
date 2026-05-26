class Solution {
    public int parseToSeconds(String time) {
        String[] tmp = time.split(":");
        return Integer.parseInt(tmp[0]) * 60 + Integer.parseInt(tmp[1]);
    }
    
    public String solution(String video_len, String pos, 
                           String op_start, String op_end, String[] commands) {
        int time = parseToSeconds(pos);
        int os = parseToSeconds(op_start);
        int oe = parseToSeconds(op_end);
        int len = parseToSeconds(video_len);
        
        if (time >= os && time <= oe) time = oe;
        
        for (String cmd : commands) {
            if (cmd.equals("prev")) {
                if (time < 10) time = 0;
                else time -= 10;
            }
            
            if (cmd.equals("next")) {
                if (time > len - 10) time = len;
                else time += 10;
            }
            
            if (time >= os && time <= oe) time = oe;
        }
        
        StringBuilder sb = new StringBuilder();
        
        String mm = String.valueOf(time/60);
        if (mm.length() == 1) sb.append("0");
        sb.append(mm + ":");
        
        String ss = String.valueOf(time%60);
        if (ss.length() == 1) sb.append("0");
        sb.append(ss);
        
        return sb.toString();
    }
}