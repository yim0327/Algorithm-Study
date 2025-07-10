class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String s = "";
        String s_k = String.valueOf(k);
        
        for(int n = i; n < j+1; n++){
            s = String.valueOf(n);
            for(int m = 0; m < s.length(); m++){
                answer += (s.charAt(m)+"").equals(s_k) ? 1 : 0;
            }
        }
        
        return answer;
    }
}