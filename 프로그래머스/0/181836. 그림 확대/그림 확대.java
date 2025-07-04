class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int idx = 0;
        for(String s : picture){
            s = s.replace(".", ".".repeat(k)).replace("x", "x".repeat(k));
            for(int i = 0; i < k; i++){
                answer[idx] = s;
                idx++;
            }
        }
        return answer;
    }
}