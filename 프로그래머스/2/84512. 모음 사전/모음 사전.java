class Solution {
    private void changeWords(StringBuilder sb, int i) {
        
        if (sb.charAt(i) == 'A') sb.replace(i, i+1, "E");
        else if (sb.charAt(i) == 'E') sb.replace(i, i+1, "I");
        else if (sb.charAt(i) == 'I') sb.replace(i, i+1, "O");
        else if (sb.charAt(i) == 'O') sb.replace(i, i+1, "U");
        else if (sb.charAt(i) == 'U') {
            sb.delete(i, i+1);
            changeWords(sb, i-1);
        }
        
    }
    
    public int solution(String word) {
        int answer = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        
        while (!sb.toString().equals(word)) {
            if (sb.length() < 5) sb.append("A");
            else changeWords(sb, 4);
            answer++;
        }
                
        return answer;
    }
}


// AAAAA = 5
// AAAAE = 6
// AAAAU = 9
// AAAE  = 10
// AAAEA = 11
// AAAEU = 15
// AAAI  = 16
// AAAIA = 17

// AAUUU
// AE

// AAAUU
// AAE