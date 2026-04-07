class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        String s = "0123456789";
        
        for (int i = 0; i < numbers.length; i++) {
            String tmp = String.valueOf(numbers[i]);
            s = s.replace(tmp, "");
        }
        
        String[] remain = s.split("");
                
        for (String r : remain) {
            answer += Integer.parseInt(r);
        }
        
        return answer;
    }
}