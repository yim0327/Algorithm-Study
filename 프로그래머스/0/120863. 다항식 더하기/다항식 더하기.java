class Solution {
    public String solution(String polynomial) {
        int cnt_x = 0;
        int cnt_n = 0;
        String[] pol = polynomial.split(" ");
        
        for(String s : pol){
            if(s.contains("x")){
                s = s.replace("x", "");
                cnt_x += s.equals("") ? 1 : Integer.parseInt(s);
            }
            else if(s.equals("+")){
                continue;
            }
            else{
                cnt_n += Integer.parseInt(s);
            }
        }
        
        String answer = "";
        answer += cnt_x == 0 ? "" : cnt_x == 1 ? "x" : cnt_x+"x";
        answer += cnt_n == 0 ? "" : cnt_x == 0 ? ""+cnt_n : " + "+cnt_n;
        
        return answer;
    }
}