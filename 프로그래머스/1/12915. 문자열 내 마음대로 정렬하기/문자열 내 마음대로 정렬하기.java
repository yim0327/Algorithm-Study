import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        for (int i = 0; i < strings.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strings[i].charAt(n)).append(strings[i]);
            strings[i] = sb.toString();
        }
        
        Arrays.sort(strings);
        
        for (int i = 0; i < strings.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strings[i]).delete(0, 1);
            strings[i] = sb.toString();
        }
        
        return strings;
    }
}