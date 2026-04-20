class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            String s = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);
            
            s = String.format("%0"+ n +"d", Long.parseLong(s));
            s2 = String.format("%0"+ n +"d", Long.parseLong(s2));
            
            StringBuilder sb = new StringBuilder();
            
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == '1' || s2.charAt(j) == '1') {
                    sb.append("#");
                }
                else {
                    sb.append(" ");
                }
            }
            
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}