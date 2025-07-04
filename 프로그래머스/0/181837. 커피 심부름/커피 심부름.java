class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String s : order){
            answer += s.contains("cafelatte") ? 5000 : 4500;
        }
        return answer;
    }
}