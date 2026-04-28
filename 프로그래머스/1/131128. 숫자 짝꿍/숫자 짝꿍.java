class Solution {
    public String solution(String X, String Y) {
        int[][] arr = new int[2][10]; // 0~9
        String s = "";
        
        for (int i = 0; i < X.length(); i++) {
            s = String.valueOf(X.charAt(i));
            arr[0][Integer.parseInt(s)]++;
        }
        for (int j = 0; j < Y.length(); j++) {
            s = String.valueOf(Y.charAt(j));
            arr[1][Integer.parseInt(s)]++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int k = 9; k >= 0; k--) {
            int tmp = Math.min(arr[0][k], arr[1][k]);
            sb.append(String.valueOf(k).repeat(tmp));
        }
        
        if (sb.toString().equals("")) return "-1";
        if (sb.toString().replace("0", "").equals("")) return "0";
        
        return sb.toString();
    }
}