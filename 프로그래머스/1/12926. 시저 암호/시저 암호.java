class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        
        for (char c : arr) {
            if (c != ' ') {
                c += n;
                
                if ((Character.isLowerCase(c-n) && c > 122)
                    || (Character.isUpperCase(c-n) && c > 90)) {
                    c -= 26;
                }
            }
            sb.append(c);
        }
        
        return sb.toString();
    }
}