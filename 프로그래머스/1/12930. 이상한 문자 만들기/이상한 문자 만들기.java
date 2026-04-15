class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        String[] tmp = s.split("");
        int idx = 0;
        
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i].equals(" ")) {
                idx = 0;
                sb.append(" ");
            }
            else {
                if (idx == 0 || idx % 2 == 0) {
                    sb.append(tmp[i].toUpperCase());
                }
                else {
                    sb.append(tmp[i].toLowerCase());
                }
                idx++;
            }
        }
        
        return sb.toString();
    }
}