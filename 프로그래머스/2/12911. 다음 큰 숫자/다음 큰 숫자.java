class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String bn = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(bn);
        
        int idx = 0;
        
        if (bn.contains("01")) {
            sb.reverse();
            
            idx = sb.indexOf("10");
            sb.replace(idx, idx+2, "01");
        }
        else {
            idx = 2;
            sb.replace(0, 1, "10").reverse();
        }
        
        StringBuilder tmp = new StringBuilder();
            
        for (int i = 0; i < idx; i++) {
            if (sb.charAt(i) == '1') tmp.insert(0, "1");
            else tmp.append("0");
        }

        sb.replace(0, idx, tmp.toString()).reverse();

        answer = Integer.parseInt(sb.toString(), 2);
        
        return answer;
    }
}