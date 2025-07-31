class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        int idx = 0;
        
        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(0) == B.charAt(i)) {
                idx = i;
                
                if(check(A, B, idx)) {
                    return i;
                }
            }
        }
        
        return -1;
    }
    
    // 밀어서 만들 수 있는 지 체크하는 메서드.
    public boolean check(String A, String B, int idx) {
        for(int i = 1; i < A.length(); i++) {
           idx++;
           if(A.charAt(i) != B.charAt(idx%B.length()))
               return false;
        }
        return true;
    }
}