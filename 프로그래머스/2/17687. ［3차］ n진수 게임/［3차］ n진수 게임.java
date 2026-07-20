class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder entireString = new StringBuilder();
        StringBuilder myString = new StringBuilder();

        int num = 0;
        
        // 순회용 전체 문자열 세팅
        while (entireString.length() < m * t) {
            entireString.append(Integer.toString(num, n));
            num++;
        }
        
        int idx = p-1;
        
        // m씩 전진하면서 문자 선택
        for (int i = 0; i < t; i++) {
            myString.append(entireString.charAt(idx));
            idx += m;
        }
        
        return myString.toString().toUpperCase();
    }
}