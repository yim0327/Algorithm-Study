class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            char tmp = c;
            int cnt = 0;
            
            while (cnt < index) {
                tmp = (tmp == 'z' ? 'a' : (char)(tmp+1));
                if (!skip.contains(String.valueOf(tmp))) cnt++;
            }
            
            sb.append(tmp);
        }        
        
        return sb.toString();
    }
}