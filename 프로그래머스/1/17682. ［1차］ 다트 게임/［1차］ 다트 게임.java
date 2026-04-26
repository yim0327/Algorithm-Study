import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {
    public int solution(String dartResult) {
        Pattern p = Pattern.compile("([0-9]|10)([SDT])([*#]?)");
        Matcher m = p.matcher(dartResult);
                
        int[] arr = new int[3];
        int idx = 0;
        
        while (m.find()) {
            int n = 0;
            
            if (m.group(2).equals("S")) n = 1;
            else if (m.group(2).equals("D")) n = 2;
            else if (m.group(2).equals("T")) n = 3;
            else n = 0;
            
            arr[idx] += Math.pow(Integer.parseInt(m.group(1)), n);
            
            String tmp = m.group(3);
            
            if (!tmp.equals("")) {
                if (tmp.equals("*") && idx == 0) {
                    arr[0] *= 2;
                }
                else if (tmp.equals("*") && idx != 0) {
                    arr[idx] *= 2;
                    arr[idx-1] *= 2;
                }
                else {
                    arr[idx] *= (-1);
                }
            }
            
            idx++;
        }
        
        int answer = 0;
        
        for (int i = 0; i < arr.length; i++) answer += arr[i];
        
        return answer;
    }
}