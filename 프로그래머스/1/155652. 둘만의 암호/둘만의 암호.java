class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        char[] srr = s.toCharArray();
        
        // 한 자씩 보기
        for (int i = 0; i < srr.length; i++) {
            int num = (int) srr[i];
            
            // 인덱스만큼 점프
            for (int j = 0; j < index; j++) {
                num++;
                
                if (String.valueOf((char)num)
                    .matches("["+skip+"]")) {
                    j--;
                }
                
                if (num > 'z') {
                    num = num - ('z' - 'a' + 1);
                    if (String.valueOf((char)num)
                        .matches("["+skip+"]")) j--;
                }
            }
            
            char c = (char) num;
            sb.append(c);
        }
        
        return sb.toString();
    }
}